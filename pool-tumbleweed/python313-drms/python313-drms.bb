SUMMARY = "Tool to access HMI, AIA and MDI data with Python"
DESCRIPTION = "The drms module provides an interface for accessing HMI, AIA and MDI \
data with Python. It uses the publicly accessible JSOC DRMS server by \
default, but can also be used with local NetDRMS sites."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python313-drms-0.9.1-1.1.noarch.rpm"
RPM_HASH = "6434c9d69559ae58c119235c9d1b5f93dc3ced8f6106eb9e90754f26fe5be6f92a9f7a0f56f1325de2c4cf8a87df50a216bebff93f3cbdd4bdf8fe524c35ae13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-drms \
python3.13dist-drms \
python313-drms \
python3dist-drms"

RDEPENDS:${PN} += "python-abi \
python313-numpy \
python313-packaging \
python313-pandas \
update-alternatives"

inherit rpm
