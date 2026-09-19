SUMMARY = "Command-Line Program to Extract WinZix Archives"
DESCRIPTION = "Unzix is a small command-line program for extracting files from the new WinZix \
archive format."
LICENSE = "BSD-3-Clause"

PV = "0.4.0"

RPM_NAME = "unzix-0.4.0-2.24.aarch64.rpm"
RPM_HASH = "657d4c7f60e4424108c505e8d0fb477caefbafaa16877756c16bf5197d8ca16c9260bc273fa181d6e25c51cabe8025533d078c4cad0a1466c4ac8bd8070b160a"

RPROVIDES:${PN} += "unzix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
