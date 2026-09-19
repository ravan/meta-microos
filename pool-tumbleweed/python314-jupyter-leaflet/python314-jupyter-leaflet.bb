SUMMARY = "Leaflet extensions for JupyterLab and Jupyter Notebook"
DESCRIPTION = "Interactive leaflet widget for the Jupyter notebook \
 \
The reference Python backend is ipyleaflet"
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python314-jupyter-leaflet-0.20.0-1.4.noarch.rpm"
RPM_HASH = "06a59ee9d2263506bfe1f45643102d107579165f762c6ad1b38acbb1616ce721b37c3a232c2e3c2064a477e564e6dc35eb93a2ceab9954750070e517b64405ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-leaflet \
python314-jupyter-leaflet \
python3dist-jupyter-leaflet"

RDEPENDS:${PN} += "jupyter-leaflet \
python-abi"

inherit rpm
