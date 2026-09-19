SUMMARY = "Microsoft Azure ai-language Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-language Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-ai-language-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "cad324eeb26de3e4fb1e8fea49eaef4339c96acf34ba611996638c7069fe2b3e2907ba41a5b3b72782d0739ce6efe00d66e5e251dcbc2d3c05f7a8a7f331f35f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-ai-language-nspkg \
python314-azure-ai-language-nspkg \
python3dist-azure-ai-language-nspkg"

RDEPENDS:${PN} += "python314-azure-ai-nspkg \
python314-azure-nspkg"

inherit rpm
