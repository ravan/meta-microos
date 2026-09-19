SUMMARY = "Metalink Library"
DESCRIPTION = "Libmetalink is a Metalink library written in C language. It is intended to \
provide the programs written in C to add Metalink functionality such as parsing \
Metalink XML files."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "libmetalink3-0.1.3-5.5.aarch64.rpm"
RPM_HASH = "cbed807df3a27b2e7a4db13d0af36fe4b49911437062bf4f09bd0f97d7d4cd258fd1847d68184375fa94bd538e6b9cfbb118a6ad5c6fb99f997f1e1105ca1248"

RPROVIDES:${PN} += "libmetalink.so.3 \
libmetalink3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1"

inherit rpm
