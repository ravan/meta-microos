SUMMARY = "ComfyUI workflow template media assets bundle 01"
DESCRIPTION = "Media assets bundle 01 for ComfyUI workflow templates."
LICENSE = "MIT"

PV = "0.1.44"

RPM_NAME = "python313-comfyui-workflow-templates-media-assets-01-0.1.44-1.1.noarch.rpm"
RPM_HASH = "d137fbd83ce6eb95c0e3536f28b86679abdb2f0473e3af7373a2f774177436c1f66214a972032be2930d934ff33f2d497bc67d797f8b483fa019b5e196e06925"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comfyui-workflow-templates-media-assets-01 \
python3.13dist-comfyui-workflow-templates-media-assets-01 \
python313-comfyui-workflow-templates-media-assets-01 \
python3dist-comfyui-workflow-templates-media-assets-01"

RDEPENDS:${PN} += "python-abi"

inherit rpm
