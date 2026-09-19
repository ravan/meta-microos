SUMMARY = "Microsoft Azure Billingbenefits Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Billingbenefits Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python314-azure-mgmt-billingbenefits-1.0.0~b2-1.2.noarch.rpm"
RPM_HASH = "a0dc0328e850bfd4ee5a2b109b1a17b444e3bc18724f35bec52a385d75a88de0081836f61a185ca18cdf2095f840f9fcf9fff83b6c8d00b4060d76fb89ed688b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-billingbenefits \
python314-azure-mgmt-billingbenefits \
python3dist-azure-mgmt-billingbenefits"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
