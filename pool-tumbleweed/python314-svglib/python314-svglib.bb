SUMMARY = "Python library for reading and converting SVG"
DESCRIPTION = "Pure Python library for reading and converting SVG."
LICENSE = "LGPL-3.0-only"

PV = "1.6.0"

RPM_NAME = "python314-svglib-1.6.0-1.5.noarch.rpm"
RPM_HASH = "fb8e84e9cbd6aaec4620e04e65ecfad11cec0d2e718b9fc1b5446f5b00fc633e7c3d776604ad1a9cf7489b60e79faf980efb0213daa9a7ac5dceb2b749d39041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-svglib \
python314-svglib \
python3dist-svglib"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-cssselect2 \
python314-lxml \
python314-reportlab \
python314-rlpycairo \
python314-tinycss2 \
update-alternatives"

inherit rpm
