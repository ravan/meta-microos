SUMMARY = "Colorthief reimagined"
DESCRIPTION = "Python-modern-colorthief is a rewritten rust python-colorthief replacement"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python314-modern-colorthief-0.3.0-2.2.aarch64.rpm"
RPM_HASH = "276c598df15273fca78e6ea7bef8dc162042e83f66a21f08c853e02b3b30b3f2ec84734c17ff5c1b40d0104dd1c07a342d69795b8f5a983959bf04ac8b370a86"

RPROVIDES:${PN} += "python3.14dist-modern-colorthief \
python314-modern-colorthief \
python3dist-modern-colorthief"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
alts \
libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
