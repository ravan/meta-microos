SUMMARY = "Embedded documentation for ComfyUI nodes"
DESCRIPTION = "Localized Markdown documentation and images for ComfyUI built-in \
nodes, consumed by the ComfyUI frontend help pages."
LICENSE = "GPL-3.0-only"

PV = "0.5.11"

RPM_NAME = "python313-comfyui-embedded-docs-0.5.11-1.1.noarch.rpm"
RPM_HASH = "07cfe826424e5334f66e74112fff5921e0c9442526787ae7a9467273b26049d729774705f9eeb6df3a8d95c9a2d9f24584253b5d3852f3525cbd7ce990678b83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-comfyui-embedded-docs \
python3.13dist-comfyui-embedded-docs \
python313-comfyui-embedded-docs \
python3dist-comfyui-embedded-docs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
