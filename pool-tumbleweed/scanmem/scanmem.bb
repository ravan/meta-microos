SUMMARY = "Interactive debugging utility"
DESCRIPTION = "scanmem is a debugging utility designed to isolate the address of an \
arbitrary variable in an executing process. scanmem simply needs to be told \
the PID of the process, and the value of the variable at several different \
times. After several scans of the process, scanmem isolates the position of \
the variable and allows you to modify its value."
LICENSE = "GPL-3.0-only"

PV = "0.17"

RPM_NAME = "scanmem-0.17-3.10.aarch64.rpm"
RPM_HASH = "e3ebe1ff5357e72c69d85c41ad0502dc25d1001cc88867af4a9fdbcd3244a029f298a4c0f9ae8e3bdaa3391ff72d12c70cc1c4ed95fbf01c1976802da49b1106"

RPROVIDES:${PN} += "libscanmem.so.1 \
scanmem"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libreadline.so.8"

inherit rpm
