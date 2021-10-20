module traffic_light 
(
    clk,reset,y
);
input clk,reset;
output y;
reg state;
parameter S0 = 1'b0,S1 = 1'b1;  //S1??30s?S0??40s????S0.

always @(posedge reset or posedge clk or negedge clk) 
begin
    if (reset)
        state<=S0;
    else
        case (state)
            S0: if($time%70==40) state=S1;
            S1: if($time%70==0)  state=S0;
        endcase

end

assign y=state;
endmodule //traffic_light