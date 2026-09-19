SUMMARY = "Leaflet extensions for JupyterLab and Jupyter Notebook"
DESCRIPTION = "Interactive leaflet widget for the Jupyter notebook \
 \
The reference Python backend is ipyleaflet"
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python313-jupyter-leaflet-0.20.0-1.4.noarch.rpm"
RPM_HASH = "ed8769cb1341d31cd18d29e111a1b9095fd698fbff7560c4e946d2eeb41bc2b43c54629a8296586795862e76b2499c2d89505a4460e036fcab34802406e5df9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-leaflet \
python3.13dist-jupyter-leaflet \
python313-jupyter-leaflet \
python3dist-jupyter-leaflet"

RDEPENDS:${PN} += "jupyter-leaflet \
python-abi"

inherit rpm
