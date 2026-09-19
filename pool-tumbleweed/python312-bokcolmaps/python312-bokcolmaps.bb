SUMMARY = "Colourmap plots based on the Bokeh visualisation library"
DESCRIPTION = "Colourmap plots based on the Bokeh visualisation library"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python312-bokcolmaps-2.0.1-3.1.noarch.rpm"
RPM_HASH = "e722ad8f5ed42acd0a0a80db9056ae4f39714dbed1ab05ef4c1fae465b49d934a18033c922dcf03446c0d44312dbe54cecb98cf20cf469485ab9fa2863073127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-bokcolmaps \
python312-bokcolmaps \
python3dist-bokcolmaps"

RDEPENDS:${PN} += "python-abi \
python312-bokeh \
python312-numpy"

inherit rpm
