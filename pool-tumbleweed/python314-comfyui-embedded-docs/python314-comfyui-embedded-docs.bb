SUMMARY = "Embedded documentation for ComfyUI nodes"
DESCRIPTION = "Localized Markdown documentation and images for ComfyUI built-in \
nodes, consumed by the ComfyUI frontend help pages."
LICENSE = "GPL-3.0-only"

PV = "0.5.11"

RPM_NAME = "python314-comfyui-embedded-docs-0.5.11-1.1.noarch.rpm"
RPM_HASH = "b35603091534ba01e8113c7b04974af2aef667a49bdb24e616c3d90c47702b400efd5b6eee3dc9541618a11324d76e159740794c40bf4c03f3fa797d14fd99a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-comfyui-embedded-docs \
python314-comfyui-embedded-docs \
python3dist-comfyui-embedded-docs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
