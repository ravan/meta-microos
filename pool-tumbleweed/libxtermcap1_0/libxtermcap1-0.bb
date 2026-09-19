SUMMARY = "A termcap implementation"
DESCRIPTION = "An implementation of termcap, i.e. the termcap C functions tgetent, tputs, \
etc., including the parser for the /usr/share/misc/termcap file."
LICENSE = "CDDL-1.0"

PV = "2024.03.21"

RPM_NAME = "libxtermcap1_0-2024.03.21-53.5.aarch64.rpm"
RPM_HASH = "92d594d6d42f5e3f8549aff58d884cc05948998d01cf7dacbb4833449a7ecd073a4689bf86bca36d5bdfcc365def1e93424d101b9ba30e14cba7f23035844a11"

RPROVIDES:${PN} += "libxtermcap.so.1.0 \
libxtermcap1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libschily.so.2.0"

inherit rpm
