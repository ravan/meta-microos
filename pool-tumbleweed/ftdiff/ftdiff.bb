SUMMARY = "Compare font hinting modes"
DESCRIPTION = "Compare font hinting modes \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.14.3"

RPM_NAME = "ftdiff-2.14.3-1.2.aarch64.rpm"
RPM_HASH = "ed8927b53c4b332562e44bc3f52044253bdf53ca8c1012ba6debc21010aeb3ae8a022c7c93e34227797afd763b99b34d0ec149b3900eed26d02e2b144f55c67a"

RPROVIDES:${PN} += "ftdiff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
librsvg-2.so.2"

inherit rpm
