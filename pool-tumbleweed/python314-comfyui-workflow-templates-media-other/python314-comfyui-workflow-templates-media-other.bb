SUMMARY = "Audio, 3D and misc ComfyUI workflow media assets"
DESCRIPTION = "Media bundle containing audio, 3D and miscellaneous workflow assets \
for ComfyUI templates."
LICENSE = "MIT"

PV = "0.3.229"

RPM_NAME = "python314-comfyui-workflow-templates-media-other-0.3.229-1.1.noarch.rpm"
RPM_HASH = "cc4801fdee75dbd4f990317798e5efcc25bfb1744e3fdb5d9ebe7a94db16d552777af3924e914bb8519b6c07e195cd460a9b1c0865da0149dcae661aa5e87860"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-comfyui-workflow-templates-media-other \
python314-comfyui-workflow-templates-media-other \
python3dist-comfyui-workflow-templates-media-other"

RDEPENDS:${PN} += "python-abi"

inherit rpm
