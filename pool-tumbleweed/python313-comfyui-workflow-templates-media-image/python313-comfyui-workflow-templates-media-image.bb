SUMMARY = "Image ComfyUI workflow media assets"
DESCRIPTION = "Media bundle containing image workflow assets for ComfyUI \
templates."
LICENSE = "MIT"

PV = "0.3.160"

RPM_NAME = "python313-comfyui-workflow-templates-media-image-0.3.160-1.1.noarch.rpm"
RPM_HASH = "46f07167e2b25ed0b381d61002dae2dc25565c592de15dd456e00e39e1f2d7eeb9d883bd264c9675be3f1f263f8486899c935e77452f2bd5dd3f7e3fa83b328a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comfyui-workflow-templates-media-image \
python3.13dist-comfyui-workflow-templates-media-image \
python313-comfyui-workflow-templates-media-image \
python3dist-comfyui-workflow-templates-media-image"

RDEPENDS:${PN} += "python-abi"

inherit rpm
