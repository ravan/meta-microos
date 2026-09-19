SUMMARY = "Colourmap plots based on the Bokeh visualisation library"
DESCRIPTION = "Colourmap plots based on the Bokeh visualisation library"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python311-bokcolmaps-2.0.1-3.1.noarch.rpm"
RPM_HASH = "572bb7b3bbca68d9c4a3e2232ff9ba267ec4669e9b47448e9a6c6facd700e4ebae2a5123de87708af0ebbf7bf3e71c1daf351d6d601a0ae84b5adf2274ac616d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-bokcolmaps \
python311-bokcolmaps \
python3dist-bokcolmaps"

RDEPENDS:${PN} += "python-abi \
python311-bokeh \
python311-numpy"

inherit rpm
