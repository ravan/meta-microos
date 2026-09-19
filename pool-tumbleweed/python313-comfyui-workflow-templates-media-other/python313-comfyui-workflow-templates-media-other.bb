SUMMARY = "Audio, 3D and misc ComfyUI workflow media assets"
DESCRIPTION = "Media bundle containing audio, 3D and miscellaneous workflow assets \
for ComfyUI templates."
LICENSE = "MIT"

PV = "0.3.229"

RPM_NAME = "python313-comfyui-workflow-templates-media-other-0.3.229-1.1.noarch.rpm"
RPM_HASH = "2f779e185db3abd2563e720fb80a447404dbc207ff93d343c0e8eb5110d983ca44995fb7896b986ada09fb3f17068dd30d3e70a6a057c031cc89a9a51622b2bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comfyui-workflow-templates-media-other \
python3.13dist-comfyui-workflow-templates-media-other \
python313-comfyui-workflow-templates-media-other \
python3dist-comfyui-workflow-templates-media-other"

RDEPENDS:${PN} += "python-abi"

inherit rpm
