SUMMARY = "Microsoft Azure Video Analyzer Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Video Analyzer Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b4"

RPM_NAME = "python313-azure-mgmt-videoanalyzer-1.0.0b4-2.9.noarch.rpm"
RPM_HASH = "1276104ef9e572a3b6baf860d5bf2e01f00c18ccde60b43355d03de9a66c5e31cbb3ba92b934d460f9ea8c69e9f0abb8385b25f177196d504cf45db21e3792be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-videoanalyzer \
python3.13dist-azure-mgmt-videoanalyzer \
python313-azure-mgmt-videoanalyzer \
python3dist-azure-mgmt-videoanalyzer"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-msrest"

inherit rpm
