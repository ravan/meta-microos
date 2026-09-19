SUMMARY = "Workflow template JSON definitions for ComfyUI"
DESCRIPTION = "Workflow template JSON definitions used by the ComfyUI template \
picker."
LICENSE = "MIT"

PV = "0.1.74"

RPM_NAME = "python313-comfyui-workflow-templates-json-0.1.74-1.1.noarch.rpm"
RPM_HASH = "33d67ef8ad80bc700e605a431693e1b5bf27250b2ce1450d8b0287d9b45e609dec0519c11111ad20947b8053d2350006ff38704247cfb52538b567c6dfd8bb6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comfyui-workflow-templates-json \
python3.13dist-comfyui-workflow-templates-json \
python313-comfyui-workflow-templates-json \
python3dist-comfyui-workflow-templates-json"

RDEPENDS:${PN} += "python-abi"

inherit rpm
