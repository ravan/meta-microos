SUMMARY = "API-driven ComfyUI workflow media assets"
DESCRIPTION = "Media bundle containing API-driven workflow assets for ComfyUI \
templates."
LICENSE = "MIT"

PV = "0.3.84"

RPM_NAME = "python313-comfyui-workflow-templates-media-api-0.3.84-1.1.noarch.rpm"
RPM_HASH = "dd13770e580512f9cef45d573c7bdb61e711e54602fbf3570add5569005380813e1a7582892b61a4f1d8b0f8a5e716ff66563fed92de7b660c91dfcec453c43f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comfyui-workflow-templates-media-api \
python3.13dist-comfyui-workflow-templates-media-api \
python313-comfyui-workflow-templates-media-api \
python3dist-comfyui-workflow-templates-media-api"

RDEPENDS:${PN} += "python-abi"

inherit rpm
