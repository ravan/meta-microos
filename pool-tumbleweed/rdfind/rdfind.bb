SUMMARY = "Find duplicate files and replace them with symlinks or hardlinks"
DESCRIPTION = "Rdfind is a program that finds duplicate files. It is useful for compressing \
backup directories or just finding duplicate files. It compares files based on \
their content, NOT on their file names."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "rdfind-1.8.0-1.3.aarch64.rpm"
RPM_HASH = "5acfcb8fc5455f23345ca64eecd237b65d56b26974b4c7b08b4535921ce15d9f6309bd87aba39b1605939ad94bc9e20d37c10c2093e4891819f808ad83e9addb"

RPROVIDES:${PN} += "rdfind"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnettle.so.8 \
libstdc++.so.6"

inherit rpm
