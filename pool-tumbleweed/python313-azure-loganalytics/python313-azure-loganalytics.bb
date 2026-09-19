SUMMARY = "Microsoft Azure Log Analytics Client Library"
DESCRIPTION = "This is the Microsoft Azure Log Analytics Client Library. \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python313-azure-loganalytics-0.1.1-3.9.noarch.rpm"
RPM_HASH = "ea6a9b24529a13f8a9d5508968a0dd6ccad939a871fe4d0b3ae534be1d50e1aeb5dd6103d1ee4419519f9f894fe8c4913e783ed56bb33c06da8d4037fb63acf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-loganalytics \
python3.13dist-azure-loganalytics \
python313-azure-loganalytics \
python3dist-azure-loganalytics"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
python-abi \
python313-azure-nspkg \
python313-msrest"

inherit rpm
