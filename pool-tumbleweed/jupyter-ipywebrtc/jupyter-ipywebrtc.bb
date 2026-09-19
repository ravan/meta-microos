SUMMARY = "WebRTC for Jupyter notebook/lab"
DESCRIPTION = "WebRTC and MediaStream API exposed in the Jupyter notebook. \
 \
This package provides the jupyter notebook and jupyterlab \
extensions."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "jupyter-ipywebrtc-0.6.0-5.8.noarch.rpm"
RPM_HASH = "af69104a1b52b46b2ce492873ac8adc59002f71339d2a6d5f620f917948b4dc0ac921a39f42b9e8c637097649984f9d155dbbd700feb146f04934e79a8d17eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-ipywebrtc"

RDEPENDS:${PN} += "jupyter-ipywidgets \
python3dist-ipywebrtc"

inherit rpm
