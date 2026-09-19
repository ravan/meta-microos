SUMMARY = "Virtual Network Terminal supporting the Com Port Control Option (RFC2217)"
DESCRIPTION = "ttynvt makes a virtual serial device (tty) and connects \
the device to a Network Virtual Terminal (NVT)."
LICENSE = "GPL-3.0-or-later"

PV = "0.17"

RPM_NAME = "ttynvt-0.17-1.5.aarch64.rpm"
RPM_HASH = "628d8c6c879ba35c6f160b8986730feee3b5d43ac753c3d2bdb6adacc28495c3e477accf682ee9556731bd7e6065c685208bc155e3a3f94d21ebd4416f8527f7"

RPROVIDES:${PN} += "ttynvt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse.so.2"

inherit rpm
