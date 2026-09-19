SUMMARY = "Interactive leaflet widget for the Jupyter notebook - Jupyter files"
DESCRIPTION = "Interactive leaflet widget for the Jupyter notebook \
 \
This package provides the extensions for jupyter notebook and jupyterlab."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "jupyter-leaflet-0.20.0-1.4.noarch.rpm"
RPM_HASH = "1731c2fc187861e3a3a7d48f35ee6dad011b559dd2f0e73f058946b2fa62ed8d967fea0afe4bd183e05bdcccf8f6a6b3b47d919ed87356e2ef60636cd9b8ca24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jupyter-leaflet"

RDEPENDS:${PN} += "python3dist-jupyter-leaflet"

inherit rpm
