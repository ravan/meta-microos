SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python313-ipywebrtc-0.6.0-5.8.noarch.rpm"
RPM_HASH = "a9b67ba25ffd4d8886b45c579545df3ee144696058b3a85b76ae650871d2ff7e189ab9dffd20f06f0b92af8f7a127dbd682beb0e4ae389cbe2ea56730dca04b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ipywebrtc \
python3.13dist-ipywebrtc \
python313-ipywebrtc \
python3dist-ipywebrtc"

RDEPENDS:${PN} += "jupyter-ipywebrtc \
python-abi \
python313-ipywidgets"

inherit rpm
