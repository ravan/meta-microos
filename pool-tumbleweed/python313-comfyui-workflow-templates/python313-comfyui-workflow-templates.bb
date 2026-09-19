SUMMARY = "ComfyUI workflow templates meta package"
DESCRIPTION = "Meta package that re-exports the ComfyUI workflow template helpers \
and pulls in the core, JSON and media asset bundles at the versions \
this release is pinned to."
LICENSE = "MIT"

PV = "0.11.59"

RPM_NAME = "python313-comfyui-workflow-templates-0.11.59-1.1.noarch.rpm"
RPM_HASH = "c40ea14dde38bd34105417336ac63f189484775e6975b73ade1d10d9bf1a3793b8195c30801e615df9db3bce6453eae792dc851868403834fcf6a9b1d1c0f534"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comfyui-workflow-templates \
python3.13dist-comfyui-workflow-templates \
python313-comfyui-workflow-templates \
python3dist-comfyui-workflow-templates"

RDEPENDS:${PN} += "python-abi \
python313-comfyui-workflow-templates-core \
python313-comfyui-workflow-templates-json \
python313-comfyui-workflow-templates-media-api \
python313-comfyui-workflow-templates-media-assets-01 \
python313-comfyui-workflow-templates-media-image \
python313-comfyui-workflow-templates-media-other \
python313-comfyui-workflow-templates-media-video"

inherit rpm
