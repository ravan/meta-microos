SUMMARY = "Font with Support for Unicode Musical Notation Symbols"
DESCRIPTION = "Musica covers the following scripts and symbols supported by The Unicode \
Standard: Basic Latin, Greek and Coptic, some Punctuation and other Symbols, \
Byzantine Musical Symbols, (Western) Musical Symbols and Archaic Greek \
Musical Notation."
LICENSE = "SUSE-Permissive"

PV = "3.17"

RPM_NAME = "gdouros-musica-fonts-3.17-1.23.noarch.rpm"
RPM_HASH = "f96f98a3075cf304181199ff8c2666207c93bb02a1dd970b60d56a82c35722d96a5cf28a5c845b1ae9bd4401438994417b98d2841b3f1b95676fec73c34118f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gdouros-musica-fonts \
musica-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
