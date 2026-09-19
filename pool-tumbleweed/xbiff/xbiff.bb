SUMMARY = "Utility to monitor a mailbox"
DESCRIPTION = "xbiff provides graphical notification of new e-mail. \
It only handles mail stored in a filesystem accessible file, \
not via IMAP, POP or other remote access protocols."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "xbiff-1.0.6-1.3.aarch64.rpm"
RPM_HASH = "85bc6d15b4176813968fd342c0977e8546cd338e137aca584972a8a66822d3fda61c0e539f10ba7d25d4a9190b4cb6843480ee50d0a2c3b09b8fb7abf685023a"

RPROVIDES:${PN} += "xbiff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXext.so.6 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6"

inherit rpm
