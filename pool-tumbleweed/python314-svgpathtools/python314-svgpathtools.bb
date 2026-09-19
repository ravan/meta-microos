SUMMARY = "Tools for manipulating and analyzing SVG Path objects and Bézier curves"
DESCRIPTION = "Svgpathtools is a collection of tools for manipulating and \
analyzing SVG Path objects and Bézier curves."
LICENSE = "MIT"

PV = "1.8.0"

RPM_NAME = "python314-svgpathtools-1.8.0-1.1.noarch.rpm"
RPM_HASH = "42d4161e4290eb2a1289026679dcac926dcf4896d585ea49da963f2f617b11ac62fd41a059fc7e84fec3cc9815982da0ba5986e95c2dedd699bcf9ec6b2c0cfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-svgpathtools \
python314-svgpathtools \
python3dist-svgpathtools"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-scipy \
python314-svgwrite"

inherit rpm
