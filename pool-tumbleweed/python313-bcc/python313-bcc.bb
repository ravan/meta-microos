SUMMARY = "Python3 bindings for the BPF Compiler Collection"
DESCRIPTION = "Python 3.x bindings for the BPF Compiler Collection."
LICENSE = "Apache-2.0"

PV = "0.37.0"

RPM_NAME = "python313-bcc-0.37.0-4.1.noarch.rpm"
RPM_HASH = "6e3e544e1d8887de917c4ff065c03a2f7cc81156e8a29b2f638627b8f57dd5dca465d33e65d479614ff468d835066116e82c2d4d8d72e3d2f0ca7f08c5aeea6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bcc \
python3.13dist-bcc \
python313-bcc \
python3dist-bcc"

RDEPENDS:${PN} += "libbcc0 \
python-abi"

inherit rpm
