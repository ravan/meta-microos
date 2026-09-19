SUMMARY = "Video ComfyUI workflow media assets"
DESCRIPTION = "Media bundle containing video workflow assets for ComfyUI \
templates."
LICENSE = "MIT"

PV = "0.3.101"

RPM_NAME = "python313-comfyui-workflow-templates-media-video-0.3.101-1.1.noarch.rpm"
RPM_HASH = "f4b7cee28230ada72fd497112f90467ec7bf023c9b05f3d4d0bc571b13b8859d2efd5c1e4e5c700ae05ef9f6f4f4a59450679df75134010ba406bf9ae3ebade8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comfyui-workflow-templates-media-video \
python3.13dist-comfyui-workflow-templates-media-video \
python313-comfyui-workflow-templates-media-video \
python3dist-comfyui-workflow-templates-media-video"

RDEPENDS:${PN} += "python-abi"

inherit rpm
