SUMMARY = "Official ComfyUI frontend as a Python package"
DESCRIPTION = "Official ComfyUI frontend static assets (HTML, JavaScript, CSS and \
related files) shipped as a Python package for installation next to \
the ComfyUI backend."
LICENSE = "GPL-3.0-only"

PV = "1.52.7"

RPM_NAME = "python314-comfyui-frontend-package-1.52.7-1.1.noarch.rpm"
RPM_HASH = "3cd7872d35671db9c3cd479d31eb72defe0cd5da6ba0eaed5c307d1ee4a9433a9b610bccdba92872c90c72eff45589289211db6ef11a99c5d94aa0d2b663d655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-comfyui-frontend-package \
python314-comfyui-frontend-package \
python3dist-comfyui-frontend-package"

RDEPENDS:${PN} += "python-abi"

inherit rpm
