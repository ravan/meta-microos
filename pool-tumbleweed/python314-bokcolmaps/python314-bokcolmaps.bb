SUMMARY = "Colourmap plots based on the Bokeh visualisation library"
DESCRIPTION = "Colourmap plots based on the Bokeh visualisation library"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python314-bokcolmaps-2.0.1-3.5.noarch.rpm"
RPM_HASH = "bb4d14ce9add20656965dc9daedaa1a7952d175775250b71802f45646691ca4f4d3b1363e9ec4baaedf4344ce18b09395fc7c74ad642972235b0ebd65c01fccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-bokcolmaps \
python314-bokcolmaps \
python3dist-bokcolmaps"

RDEPENDS:${PN} += "python-abi \
python314-bokeh \
python314-numpy"

inherit rpm
