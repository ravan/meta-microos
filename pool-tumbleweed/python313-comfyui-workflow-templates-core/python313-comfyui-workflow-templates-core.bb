SUMMARY = "Core helpers for ComfyUI workflow templates"
DESCRIPTION = "Core helpers for ComfyUI workflow templates: manifest loading, asset \
path resolution and metadata used by the media bundles and the \
comfyui-workflow-templates meta package."
LICENSE = "MIT"

PV = "0.3.339"

RPM_NAME = "python313-comfyui-workflow-templates-core-0.3.339-1.1.noarch.rpm"
RPM_HASH = "f056dfd99c232c17ddb835bebbecc4ffd40d63ceee0bdb2a75f380b2e8abd9a725f88469fdeec9d95f78332a11e779ca96f0e862d6ede435de147ea92ed34ffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comfyui-workflow-templates-core \
python3.13dist-comfyui-workflow-templates-core \
python313-comfyui-workflow-templates-core \
python3dist-comfyui-workflow-templates-core"

RDEPENDS:${PN} += "python-abi"

inherit rpm
