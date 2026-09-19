SUMMARY = "Microsoft Azure Databasewatcher Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Databasewatcher Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-databasewatcher-1.0.0~b1-1.5.noarch.rpm"
RPM_HASH = "88a059bb55901490e23997e5b918f2694727b8a53c40d8d9a5fad04045d7289172cea2b8bb95bd9c09cb561c5c83d43aaa4cbbf79cea0ff0d890bd97301b725a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-databasewatcher \
python3.13dist-azure-mgmt-databasewatcher \
python313-azure-mgmt-databasewatcher \
python3dist-azure-mgmt-databasewatcher"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
