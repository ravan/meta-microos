SUMMARY = "Microsoft Azure Education Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Education Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b3"

RPM_NAME = "python313-azure-mgmt-education-1.0.0~b3-1.1.noarch.rpm"
RPM_HASH = "242d1c8d4e658884667fb2e2012bb3e9fd8013d563cce7565caafcc8cd02e64aac214bce93bddd7183315e7add4da278d5d7f75a9ea5ea29f5c4bf9fdfdc2443"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-education \
python3.13dist-azure-mgmt-education \
python313-azure-mgmt-education \
python3dist-azure-mgmt-education"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
