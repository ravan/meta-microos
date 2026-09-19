SUMMARY = "Microsoft Azure Quota Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Quota Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "python314-azure-mgmt-quota-3.0.1-1.4.noarch.rpm"
RPM_HASH = "72a9bbcac00e01a4331fcbbdad6da9dd12b73288e6066997584c196fe9320c4391be12bef994c7b8fbcd2caa7cd9bc76eeb8065040f27fc1ce39397c09c436ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-quota \
python314-azure-mgmt-quota \
python3dist-azure-mgmt-quota"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
