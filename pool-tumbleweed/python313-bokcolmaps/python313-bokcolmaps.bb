SUMMARY = "Colourmap plots based on the Bokeh visualisation library"
DESCRIPTION = "Colourmap plots based on the Bokeh visualisation library"
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python313-bokcolmaps-2.0.1-3.5.noarch.rpm"
RPM_HASH = "0ba410984e830164bd292bfbac6e38e4e1b52a8d1c3532093620def0691fdd7165dcad216ea62373330c6b706f9c860946f7e1e0793278d936a333d6e11c5669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bokcolmaps \
python3.13dist-bokcolmaps \
python313-bokcolmaps \
python3dist-bokcolmaps"

RDEPENDS:${PN} += "python-abi \
python313-bokeh \
python313-numpy"

inherit rpm
