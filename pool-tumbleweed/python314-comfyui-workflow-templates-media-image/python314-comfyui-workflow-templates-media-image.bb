SUMMARY = "Image ComfyUI workflow media assets"
DESCRIPTION = "Media bundle containing image workflow assets for ComfyUI \
templates."
LICENSE = "MIT"

PV = "0.3.160"

RPM_NAME = "python314-comfyui-workflow-templates-media-image-0.3.160-1.1.noarch.rpm"
RPM_HASH = "9e3ac2877feae7deafa56626a9ab5cee8f7bf6b6ccc58bf826a068a18a2ba40c5d30805180a417c869719856a0137d1dbad0136506a5995603969e921206cd73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-comfyui-workflow-templates-media-image \
python314-comfyui-workflow-templates-media-image \
python3dist-comfyui-workflow-templates-media-image"

RDEPENDS:${PN} += "python-abi"

inherit rpm
