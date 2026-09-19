SUMMARY = "Utility to display ditroff output"
DESCRIPTION = "xditview displays ditroff output on an X display."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "xditview-1.0.7-1.11.aarch64.rpm"
RPM_HASH = "15190fece4236c5a407b4014544b5b64baebd4021b06cf1fbc7215d5e3b698db06aec14609b9ff546025a501adcc5fe94c9892e4a412913b6cad23fc2744243d"

RPROVIDES:${PN} += "xditview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
