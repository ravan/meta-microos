SUMMARY = "Infiniband Unicified Communication Services"
DESCRIPTION = "This framework provides infrastructure for component based \
programming, memory management, and system utilities."
LICENSE = "BSD-3-Clause"

PV = "1.21.0"

RPM_NAME = "libucs0-1.21.0-1.2.aarch64.rpm"
RPM_HASH = "4372c6b037b351f675325aee5edbb51dd37b21f522c778ce150c4e04264e51dede49f8f2c163cb4784cba1ae49fea13567f587bfcab9dcdc4b6c850b01064e7d"

RPROVIDES:${PN} += "libucs-signal.so.0 \
libucs.so.0 \
libucs0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libucm.so.0"

inherit rpm
