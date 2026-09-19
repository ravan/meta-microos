SUMMARY = "Microsoft Azure ai-language Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-language Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-ai-language-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "f37357d54fa967c5ab18deae62acaf785aa24991ba6f837a55e70490486740a00440dfcc25c7da4f5cdaafe773387a7500f23d1a9a35b55806d44f49efac22e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-language-nspkg \
python3.13dist-azure-ai-language-nspkg \
python313-azure-ai-language-nspkg \
python3dist-azure-ai-language-nspkg"

RDEPENDS:${PN} += "python313-azure-ai-nspkg \
python313-azure-nspkg"

inherit rpm
