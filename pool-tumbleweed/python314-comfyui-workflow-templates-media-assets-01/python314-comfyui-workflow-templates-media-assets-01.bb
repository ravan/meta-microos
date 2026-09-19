SUMMARY = "ComfyUI workflow template media assets bundle 01"
DESCRIPTION = "Media assets bundle 01 for ComfyUI workflow templates."
LICENSE = "MIT"

PV = "0.1.44"

RPM_NAME = "python314-comfyui-workflow-templates-media-assets-01-0.1.44-1.1.noarch.rpm"
RPM_HASH = "8c3e340344ebc54390ea041442982894c39bf5f04bc84bf95a747a3e8ca32813c7e16ad6c485e5d5ee64fba5022772c068dd8eea3da4a6c2725724e510e5d832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-comfyui-workflow-templates-media-assets-01 \
python314-comfyui-workflow-templates-media-assets-01 \
python3dist-comfyui-workflow-templates-media-assets-01"

RDEPENDS:${PN} += "python-abi"

inherit rpm
