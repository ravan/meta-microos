SUMMARY = "X utility to display system load average"
DESCRIPTION = "xload displays a periodically updating histogram of the system load \
average."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "xload-1.2.2-1.1.aarch64.rpm"
RPM_HASH = "462a7cb3589dc24305a6f9951baa8a1bdf315bfd3b118b44bc90487c989f2115b9d3f54940953e225447337e3fe663428ac0c683fa45691ba6fb91b845861989"

RPROVIDES:${PN} += "xload"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
