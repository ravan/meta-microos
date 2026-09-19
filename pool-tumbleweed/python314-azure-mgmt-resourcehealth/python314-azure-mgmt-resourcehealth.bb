SUMMARY = "Microsoft Azure ResourceHealth Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure ResourceHealth Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b7"

RPM_NAME = "python314-azure-mgmt-resourcehealth-1.0.0b7-1.1.noarch.rpm"
RPM_HASH = "263efa9f79434a363508a523235c6d941781463f45a2ece4cbe4f85d2230c8f8fd125ead2860ae1d5c874ab6d4862ccecf8941e03afc4c3ee5b9b993d2527e10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-resourcehealth \
python314-azure-mgmt-resourcehealth \
python3dist-azure-mgmt-resourcehealth"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
