`timescale 1ns/1ns

module traffic_light_tb;
reg clk,reset;
wire y;

always #1 clk=~clk;

initial 
begin
    clk=0;
    #0 reset=1;
    #40 reset=0;
    
end

traffic_light
traffic_light(.clk(clk),.reset(reset),.y(y));
endmodule //traffic_light_tb