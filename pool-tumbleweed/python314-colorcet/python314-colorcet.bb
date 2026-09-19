SUMMARY = "Collection of perceptually uniform colormaps"
DESCRIPTION = "colorcet is a collection of perceptually uniform colormaps \
for use with Python plotting programs like bokeh, matplotlib, \
holoviews, and datashader."
LICENSE = "CC-BY-4.0"

PV = "3.2.1"

RPM_NAME = "python314-colorcet-3.2.1-1.2.noarch.rpm"
RPM_HASH = "960a9e79b76284525e324a11a7cd071fc61634e6fadc63223fc55f3cde0452d56bc5b2fa90e89245c68ba22ed581112ef2eaafa1a2d689ef5720c9083d50fea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-colorcet \
python314-colorcet \
python3dist-colorcet"

RDEPENDS:${PN} += "python-abi"

inherit rpm
