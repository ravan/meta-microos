SUMMARY = "Netfilter ipset administration utility"
DESCRIPTION = "IP sets are a framework inside the Linux kernel, which can be \
administered by the ipset utility. Depending on the type, currently \
an IP set may store IP addresses, (TCP/UDP) port numbers or IP \
addresses with MAC addresses in a way, which ensures lightning speed \
when matching an entry against a set. \
 \
ipset can: \
 \
* store multiple IP addresses or port numbers and match against the \
  collection by iptables in one swoop; \
* dynamically update iptables rules against IP addresses or ports \
  without performance penalty; \
* express complex IP address and ports based rulesets with one single \
  iptables rule and benefit from the speed of IP sets"
LICENSE = "GPL-2.0-only"

PV = "7.24"

RPM_NAME = "ipset-7.24-1.6.aarch64.rpm"
RPM_HASH = "9064e46d3a2b71820c3160c80332bf2dabc31f1795d0323438c5012e62d3d9691227daff91c407783f206a44cb7a57528a70e6368930b44ff5e4618b0cb73cce"

RPROVIDES:${PN} += "ipset"

RDEPENDS:${PN} += "libc.so.6 \
libipset.so.13"

inherit rpm
