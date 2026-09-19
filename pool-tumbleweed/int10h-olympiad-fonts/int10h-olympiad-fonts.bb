SUMMARY = "Remakes of IBM 6150 prototype fonts"
DESCRIPTION = "This fontpack contains remakes of prototype fonts designed for a \
project codenamed Olympiad, which later became the IBM 6150, a.k.a. \
the RT PC, a RISC workstation and grandaddy of the PowerPC \
architecture."
LICENSE = "CC-BY-SA-4.0"

PV = "1.0"

RPM_NAME = "int10h-olympiad-fonts-1.0-1.9.noarch.rpm"
RPM_HASH = "2a2f170c2ad926c6fd9dcaffadf99c2262796005cd1b3a9a874a7ca9a2ac3256052576bbd5e0e5894a1d7e63cc233e19f09dd5f46932d2a7337f3f9d09cd4402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "int10h-olympiad-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
