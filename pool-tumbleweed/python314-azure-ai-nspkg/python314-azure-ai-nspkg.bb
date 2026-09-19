SUMMARY = "Microsoft Azure AI namespace package"
DESCRIPTION = "This is the Microsoft Azure AI namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.ai namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-ai-nspkg-1.0.0-5.9.noarch.rpm"
RPM_HASH = "2eb4c7ead568f8a66b7f17378993c3835959ee8a55638688d6fac7fc0c826250dc344514c017ea6c927dc57d46375694ec9476738c24bb0040d1782fea6d366b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-ai-nspkg \
python314-azure-ai-nspkg \
python3dist-azure-ai-nspkg"

RDEPENDS:${PN} += "python314-azure-nspkg"

inherit rpm
