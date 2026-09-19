SUMMARY = "Microsoft Azure Horizondb Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Horizondb Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python314-azure-mgmt-horizondb-1.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "c26eccf277a6a1bf0d28b383cf0a091b9eaf6cb36a945aac0492190fc8abd1387ad270f56dd089acf1586f5a540caeb63a17b8ec22f734fef8482983bbf429ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-horizondb \
python314-azure-mgmt-horizondb \
python3dist-azure-mgmt-horizondb"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
