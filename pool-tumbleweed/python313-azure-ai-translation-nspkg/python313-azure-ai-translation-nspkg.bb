SUMMARY = "Microsoft Azure ai-translation Namespace Package"
DESCRIPTION = "This is the Microsoft Azure ai-translation Services namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-ai-translation-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "89ad6834c5cb887a2738a4bdb6dda4278966cdcc5d3faa984880fd318f8d1d755794f07215108e7ba6f99af9ae75fdea8b707bc12fdea03f4ce8a4c589c618d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-translation-nspkg \
python3.13dist-azure-ai-translation-nspkg \
python313-azure-ai-translation-nspkg \
python3dist-azure-ai-translation-nspkg"

RDEPENDS:${PN} += "python313-azure-ai-nspkg \
python313-azure-nspkg"

inherit rpm
