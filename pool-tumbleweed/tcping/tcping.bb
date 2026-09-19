SUMMARY = "A ping program for TCP ports"
DESCRIPTION = "TCPing will send TCP probes to an IP address or a hostname specified \
by you and prints the result. \
It works with both IPv4 and IPv6. \
 \
TCPING uses different TCP sequence numbering for successful and \
unsuccessful probes, so that when you look at the results and spot \
a failed probe, understanding the total packet drops to that point \
would be illustrative enough. \
 \
 * Monitor your network connection. \
 * Determine packet loss. \
 * Analyze the network's latency. \
 * Show min/avg/max probes latency. \
 * Use the -r flag to retry hostname resolution after a predetermined \
   number of ping failures. If you want to test your DNS load \
   balancing or Global Server Load Balancer (GSLB), you should \
   utilize this option.. \
 * Print connection statistics on Enter key press. \
 * Display the longest encountered downtime and uptime duration and \
   time. \
 * Monitor and audit your peers network. \
 * Calculate the total uptime/downtime when conducting a maintenance. \
 * An alternative to ping in environments that ICMP is blocked."
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "tcping-2.8.0-1.4.aarch64.rpm"
RPM_HASH = "03656d015a6fe8eb4dd0b49d2f65cd51044c576589a840eba6246dcc6619dff4596fa44b48dc474f09f6d0a7479570dc9a8d81709f4e537f21a71a05bee8ab08"

RPROVIDES:${PN} += "tcping"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
