SUMMARY = "Microsoft Azure Messaging Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Messaging namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.messaging namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-messaging-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "28958997c0f8a935a4d3d556a9c80cbd1925a64d27441172921b398884d6885ab8f18ed3a3d661a11f201b72e98a363b9d7c6fb8387dd3c40089c156154fe876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-messaging-nspkg \
python314-azure-messaging-nspkg \
python3dist-azure-messaging-nspkg"

RDEPENDS:${PN} += "python314-azure-nspkg"

inherit rpm
