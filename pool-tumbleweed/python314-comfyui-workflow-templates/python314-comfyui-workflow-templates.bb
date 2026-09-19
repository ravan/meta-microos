SUMMARY = "ComfyUI workflow templates meta package"
DESCRIPTION = "Meta package that re-exports the ComfyUI workflow template helpers \
and pulls in the core, JSON and media asset bundles at the versions \
this release is pinned to."
LICENSE = "MIT"

PV = "0.11.59"

RPM_NAME = "python314-comfyui-workflow-templates-0.11.59-1.1.noarch.rpm"
RPM_HASH = "cf43b38b15ba23ca112a985da4cd4d4ab5206d9978ecb0ff45ed0778948f21dc8a01d1a2af442a65225efc4e30015d537b4ba3d1869bc725668a35b2fe5ce435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-comfyui-workflow-templates \
python314-comfyui-workflow-templates \
python3dist-comfyui-workflow-templates"

RDEPENDS:${PN} += "python-abi \
python314-comfyui-workflow-templates-core \
python314-comfyui-workflow-templates-json \
python314-comfyui-workflow-templates-media-api \
python314-comfyui-workflow-templates-media-assets-01 \
python314-comfyui-workflow-templates-media-image \
python314-comfyui-workflow-templates-media-other \
python314-comfyui-workflow-templates-media-video"

inherit rpm
