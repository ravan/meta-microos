SUMMARY = "Tools for manipulating and analyzing SVG Path objects and Bézier curves"
DESCRIPTION = "Svgpathtools is a collection of tools for manipulating and \
analyzing SVG Path objects and Bézier curves."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python313-svgpathtools-1.8.0-1.1.noarch.rpm"
RPM_HASH = "7b5e37a0acec84ca0c701249c6a63744317967714febb1197c4627e1ff721960d6dccd4e5093811147510f71b848d09a57cf7a2beebd3c5e4e1613d7883fdfa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-svgpathtools \
python3.13dist-svgpathtools \
python313-svgpathtools \
python3dist-svgpathtools"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-scipy \
python313-svgwrite"

inherit rpm
