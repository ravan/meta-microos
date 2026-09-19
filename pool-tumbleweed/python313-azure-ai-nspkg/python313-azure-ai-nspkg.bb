SUMMARY = "Microsoft Azure AI namespace package"
DESCRIPTION = "This is the Microsoft Azure AI namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python313-azure-ai-nspkg-1.0.0-5.9.noarch.rpm"
RPM_HASH = "c336b66f767a6d221757a821f45d45190eac22c1289b770aaf1a148b66f240efc0d31f5efea0a9d41606236a07982fe7d0c8a9beb2b369c0eaeac7ee20b11d96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-ai-nspkg \
python3.13dist-azure-ai-nspkg \
python313-azure-ai-nspkg \
python3dist-azure-ai-nspkg"

RDEPENDS:${PN} += "python313-azure-nspkg"

inherit rpm
