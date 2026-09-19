SUMMARY = "Microsoft Azure Resource Templatespecs Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Templatespecs Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-resource-templatespecs-1.0.0~b1-2.3.noarch.rpm"
RPM_HASH = "f23d6007947619dd1332b3716448759e8b2c56fc49929b73844e9c1982cb50c0c41e02000b9674e6789d578b1ec342872592be2cdf8347e37de24f5a19eb68ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resource-templatespecs \
python3.13dist-azure-mgmt-resource-templatespecs \
python313-azure-mgmt-resource-templatespecs \
python3dist-azure-mgmt-resource-templatespecs"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.5.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-mgmt-resource \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
