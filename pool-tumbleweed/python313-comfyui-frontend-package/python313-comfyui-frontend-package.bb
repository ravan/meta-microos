SUMMARY = "Official ComfyUI frontend as a Python package"
DESCRIPTION = "Official ComfyUI frontend static assets (HTML, JavaScript, CSS and \
related files) shipped as a Python package for installation next to \
the ComfyUI backend."
LICENSE = "GPL-3.0-only"

PV = "1.52.7"

RPM_NAME = "python313-comfyui-frontend-package-1.52.7-1.1.noarch.rpm"
RPM_HASH = "661d25d7082246738f1112a15f3ca2c9eb65e336cb81cf9cf2620113af07ce81e27e9e5a93cf1695537562dc8f637caa64048a9ecca9f3aadf612bdb84d41623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comfyui-frontend-package \
python3.13dist-comfyui-frontend-package \
python313-comfyui-frontend-package \
python3dist-comfyui-frontend-package"

RDEPENDS:${PN} += "python-abi"

inherit rpm
