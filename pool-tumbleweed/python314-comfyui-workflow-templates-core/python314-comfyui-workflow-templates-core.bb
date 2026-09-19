SUMMARY = "Core helpers for ComfyUI workflow templates"
DESCRIPTION = "Core helpers for ComfyUI workflow templates: manifest loading, asset \
path resolution and metadata used by the media bundles and the \
comfyui-workflow-templates meta package."
LICENSE = "MIT"

PV = "0.3.339"

RPM_NAME = "python314-comfyui-workflow-templates-core-0.3.339-1.1.noarch.rpm"
RPM_HASH = "010132ea79d1fac81f8e79c664655209cdbbc39bd783bf2d18a13798153e18de98d9076e39b1acc1bd16a097bf7bdd4c2a4d1897665c7695bc48407719393719"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-comfyui-workflow-templates-core \
python314-comfyui-workflow-templates-core \
python3dist-comfyui-workflow-templates-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
