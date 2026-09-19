SUMMARY = "API-driven ComfyUI workflow media assets"
DESCRIPTION = "Media bundle containing API-driven workflow assets for ComfyUI \
templates."
LICENSE = "MIT"

PV = "0.3.84"

RPM_NAME = "python314-comfyui-workflow-templates-media-api-0.3.84-1.1.noarch.rpm"
RPM_HASH = "a1755210a8081da214c021e8625c49aafe9312439955c50578aa2a4f25a395c4145d3965f7690a3a3365dadaf3d244ade79c3cb495b601cdd4f9645039023303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-comfyui-workflow-templates-media-api \
python314-comfyui-workflow-templates-media-api \
python3dist-comfyui-workflow-templates-media-api"

RDEPENDS:${PN} += "python-abi"

inherit rpm
