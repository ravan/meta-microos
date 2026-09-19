SUMMARY = "Virtual PC Simulator"
DESCRIPTION = "The VPCS can simulate up to 9 PCs. You can ping/traceroute them, or ping/traceroute \
the other hosts/routers from the virtual PCs when you study the Cisco routers in \
the Dynamips. VPCS is not the traditional PC, it is just a program running on the \
Linux or Windows, and only few network commands can be used in it. But VPCS can \
give you a big hand when you study the Cisco devices in the Dynamips. VPCS can \
replace the routers or VMware boxes which are used as PCs in the Dynamips network. \
 \
Try VPCS, it can save your CPU/Memory. It is very small. \
 \
Now, VPCS can be run in udp or ether mode. In the udp mode, VPCS sends or receives \
the packets via udp. In the ether mode, via /dev/tap, not support on the Windows."
LICENSE = "BSD-2-Clause"

PV = "0.8.4"

RPM_NAME = "vpcs-0.8.4-1.1.aarch64.rpm"
RPM_HASH = "24144732964439771ae1085b9387b122c4a8f34eb2c4806e4226814fa78f5dbf95e8d9cca832dc6351b3e3386bdcfd476372ed3e0eb7b11a81512bbfb528d9d5"

RPROVIDES:${PN} += "vpcs"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
