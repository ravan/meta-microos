SUMMARY = "Microsoft Azure Video Analyzer Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Video Analyzer Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python314-azure-mgmt-videoanalyzer-1.0.0b4-2.9.noarch.rpm"
RPM_HASH = "b48f49d99d57f966c985b3f4fa7126e5ba27d587e08b93cd55db54eee8e23c686a83d26e9f4747fb2ed9b2fcc4091da613658346582cb07577537980ab9866f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-videoanalyzer \
python314-azure-mgmt-videoanalyzer \
python3dist-azure-mgmt-videoanalyzer"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-msrest"

inherit rpm
