SUMMARY = "Microsoft Azure ai-translation Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-translation Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-ai-translation-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "bdcc1e9d32a9d24f2d556fa44f357e0d41e14d57a1e23f461f4d1c8ca6e582a765930c5d93493d9f6f839ea3d38d36f9404bd252aa075d22d44685941a0d9bb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-ai-translation-nspkg \
python314-azure-ai-translation-nspkg \
python3dist-azure-ai-translation-nspkg"

RDEPENDS:${PN} += "python314-azure-ai-nspkg \
python314-azure-nspkg"

inherit rpm
