SUMMARY = "Workflow template JSON definitions for ComfyUI"
DESCRIPTION = "Workflow template JSON definitions used by the ComfyUI template \
picker."
LICENSE = "MIT"

PV = "0.1.74"

RPM_NAME = "python314-comfyui-workflow-templates-json-0.1.74-1.1.noarch.rpm"
RPM_HASH = "ff102942fe14b05085978094926a562ffdf997d128e7872f1569c343c9248a6eb638d5777cfaa0f83e60c960cd6f57578d7568accd0836755ebe7b90c4c0cdd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-comfyui-workflow-templates-json \
python314-comfyui-workflow-templates-json \
python3dist-comfyui-workflow-templates-json"

RDEPENDS:${PN} += "python-abi"

inherit rpm
