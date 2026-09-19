SUMMARY = "Tool to access HMI, AIA and MDI data with Python"
DESCRIPTION = "The drms module provides an interface for accessing HMI, AIA and MDI \
data with Python. It uses the publicly accessible JSOC DRMS server by \
default, but can also be used with local NetDRMS sites."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python314-drms-0.9.1-1.1.noarch.rpm"
RPM_HASH = "39b4fb6fdba3b888385101cdd254219a64f4561b14ffa8c325f672da8b1357b96a0c72ef0b50fcce6708684c1f210281a065243f75b32dbc92f33fcff9232ca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-drms \
python314-drms \
python3dist-drms"

RDEPENDS:${PN} += "python-abi \
python314-numpy \
python314-packaging \
python314-pandas \
update-alternatives"

inherit rpm
