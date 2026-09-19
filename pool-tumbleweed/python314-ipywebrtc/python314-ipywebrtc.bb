SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the python interface."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python314-ipywebrtc-0.6.0-5.8.noarch.rpm"
RPM_HASH = "482f90a6b87dc909a218c5b9db1b741265e48fb30ebbb35aa45492de2a7f9e6b28383b841479b5b30c9ece353644b02d442ebbec61a49f7b8c61f75cbf107cf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ipywebrtc \
python314-ipywebrtc \
python3dist-ipywebrtc"

RDEPENDS:${PN} += "jupyter-ipywebrtc \
python-abi \
python314-ipywidgets"

inherit rpm
