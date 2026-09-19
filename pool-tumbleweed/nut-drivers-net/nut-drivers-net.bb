SUMMARY = "Network UPS Tools - Extra Networking Drivers (for Network Monitoring)"
DESCRIPTION = "Networking drivers for the Network UPS Tools. You will need them \
together with nut to provide UPS networking support. \
 \
Network UPS Tools is a collection of programs which provide a common \
interface for monitoring and administering UPS hardware."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "nut-drivers-net-2.8.5-2.2.aarch64.rpm"
RPM_HASH = "162e3f42b8f716fa5b7dc44bbcf304c4334b59dad04379018620443b79d00a21eaa4478a5b11c351b5c640d4e89115174d91d036deaf13d07ebb68c276c766cb"

RPROVIDES:${PN} += "nut-drivers-net"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libneon.so.27 \
libnetsnmp.so.45 \
libnutprivate-2-8-5-common-all.so.1 \
libnutprivate-2-8-5-drivers-common.so.1 \
nut"

inherit rpm
