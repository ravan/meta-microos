SUMMARY = "Microsoft Azure Service Groups Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Groups Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-servicegroups-1.0.0-1.1.noarch.rpm"
RPM_HASH = "c9a70fe8683b99fa1e5b64c645e2ebb2e500e55baf7b75d30a18111a3e929895d1442beddab0a066291f3a4fb74390104824d4eaecd3fac00408520e48ca3e3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-servicegroups \
python314-azure-mgmt-servicegroups \
python3dist-azure-mgmt-servicegroups"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
