SUMMARY = "TCP/IP Network Monitor"
DESCRIPTION = "IPTraf-ng is a console-based network statistics utility. It gathers a \
variety of information such as TCP connection packet and byte counts, \
interface statistics and activity indicators, TCP/UDP traffic \
breakdowns, and LAN station packet and byte counts."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.2"

RPM_NAME = "iptraf-ng-1.2.2-2.5.aarch64.rpm"
RPM_HASH = "fc2a37a1d1c26e672d3808f2c345dff2c9ebf4061f260512b13067006bc174949283530d39aacbcfdc87e815ffb52157be0ca2ea954e78dc67e078e60b54ad32"

RPROVIDES:${PN} += "iptraf \
iptraf-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpanelw.so.6 \
libtinfo.so.6"

inherit rpm
