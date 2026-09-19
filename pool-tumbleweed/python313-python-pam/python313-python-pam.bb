SUMMARY = "Python PAM module using ctypes, py3/py2"
DESCRIPTION = "Python pam module supporting py3 (and py2)."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python313-python-pam-2.0.2-1.12.noarch.rpm"
RPM_HASH = "89783b392983b9fde7b6f676b04a928d7429e1a5be752bcaa3ace4243a2458a6902325dbc284be328989e7da060077b46d36442de06f2a22ff21d68a96e82d72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-pam \
python3.13dist-python-pam \
python313-python-pam \
python3dist-python-pam"

RDEPENDS:${PN} += "python-abi"

inherit rpm
