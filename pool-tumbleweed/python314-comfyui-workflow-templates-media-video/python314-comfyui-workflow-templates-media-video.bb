SUMMARY = "Video ComfyUI workflow media assets"
DESCRIPTION = "Media bundle containing video workflow assets for ComfyUI \
templates."
LICENSE = "MIT"

PV = "0.3.101"

RPM_NAME = "python314-comfyui-workflow-templates-media-video-0.3.101-1.1.noarch.rpm"
RPM_HASH = "7a44657ef55eb03d79b263e1a04b48b58bfd0e6756651ed14e12820ec288f528ab8c05af2b58aab131d5b207ff8027c8359ea7056b2a4bae1b24ff9e628f96de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-comfyui-workflow-templates-media-video \
python314-comfyui-workflow-templates-media-video \
python3dist-comfyui-workflow-templates-media-video"

RDEPENDS:${PN} += "python-abi"

inherit rpm
