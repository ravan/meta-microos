SUMMARY = "Python library for reading and converting SVG"
DESCRIPTION = "Pure Python library for reading and converting SVG."
LICENSE = "LGPL-3.0-only"

PV = "1.6.0"

RPM_NAME = "python313-svglib-1.6.0-1.5.noarch.rpm"
RPM_HASH = "687fc0d924be7dd33b6ebbfd3615deabc120fe5dbbecfe4fb4c80729627410a91b8222a92c066d3e085f53433e4574181f0565ab1547c3c074a0d669d61cfd92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-svglib \
python3.13dist-svglib \
python313-svglib \
python3dist-svglib"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-cssselect2 \
python313-lxml \
python313-reportlab \
python313-rlpycairo \
python313-tinycss2 \
update-alternatives"

inherit rpm
