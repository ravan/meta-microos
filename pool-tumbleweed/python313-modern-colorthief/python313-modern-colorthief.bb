SUMMARY = "Colorthief reimagined"
DESCRIPTION = "Python-modern-colorthief is a rewritten rust python-colorthief replacement"
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python313-modern-colorthief-0.3.0-2.2.aarch64.rpm"
RPM_HASH = "5c8fec0fea7efdf0120c1e8748d8f8ba46c02704cf21b6fe6ba2316d3c98b58591e94fe02f516083895afd9cd95619af037b4b32c2be77c3634f7cf2737515ca"

RPROVIDES:${PN} += "python3-modern-colorthief \
python3.13dist-modern-colorthief \
python313-modern-colorthief \
python3dist-modern-colorthief"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
alts \
libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
