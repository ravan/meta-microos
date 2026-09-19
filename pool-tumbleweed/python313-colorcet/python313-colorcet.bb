SUMMARY = "Collection of perceptually uniform colormaps"
DESCRIPTION = "colorcet is a collection of perceptually uniform colormaps \
for use with Python plotting programs like bokeh, matplotlib, \
holoviews, and datashader."
LICENSE = "CC-BY-4.0"

PV = "3.2.1"

RPM_NAME = "python313-colorcet-3.2.1-1.2.noarch.rpm"
RPM_HASH = "01e49296ecb0acfbcf2fbb26b2b7df036ef6e685f7e2056613782b114d8b4953087f05f2a0494dbbc04600cd962187805bd56e568463e4fd95b71e2728e292e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorcet \
python3.13dist-colorcet \
python313-colorcet \
python3dist-colorcet"

RDEPENDS:${PN} += "python-abi"

inherit rpm
