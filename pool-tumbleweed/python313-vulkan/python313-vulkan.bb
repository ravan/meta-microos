SUMMARY = "Python bindings for the Vulkan API"
DESCRIPTION = "Python extension which supports the Vulkan API. \
It keeps the original Vulkan API and focuses on minimizing \
the differences induced by the Python language."
LICENSE = "Apache-2.0"

PV = "1.3.275.1"

RPM_NAME = "python313-vulkan-1.3.275.1-1.10.noarch.rpm"
RPM_HASH = "f36ecc3e76bd5f6e21a39809a82c0f3bcf29f037306ca479405ceca1630f7fdd694318f28b0e955f7c1d5e8bd346a47f31ac438778b08d76388b8a95a4860fc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vulkan \
python3.13dist-vulkan \
python313-vulkan \
python3dist-vulkan"

RDEPENDS:${PN} += "python-abi \
python313-cffi \
vulkan"

inherit rpm
