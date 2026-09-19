SUMMARY = "Python bindings for the Vulkan API"
DESCRIPTION = "Python extension which supports the Vulkan API. \
It keeps the original Vulkan API and focuses on minimizing \
the differences induced by the Python language."
LICENSE = "Apache-2.0"

PV = "1.3.275.1"

RPM_NAME = "python314-vulkan-1.3.275.1-1.10.noarch.rpm"
RPM_HASH = "03e061197f6bf63a0b889cb283f99fb29408f1cc3e2588a98356a6121ac9349d44c3e0b571ef4f7bc717b3232caca78ef223da960d9c7a181bbed0827116deef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-vulkan \
python314-vulkan \
python3dist-vulkan"

RDEPENDS:${PN} += "python-abi \
python314-cffi \
vulkan"

inherit rpm
