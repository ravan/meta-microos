SUMMARY = "Microsoft Communication Messages Client Library for Python"
DESCRIPTION = "his package contains a Python SDK for Azure Communication Services \
for Messages (Advanced Messaging)."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-azure-communication-messages-1.1.0-1.9.noarch.rpm"
RPM_HASH = "5281faaaf3e3ff5a6573a89bfe5a2cfd0e9c29c7584eae5aedb0e937c1d06a558af099cf588e324154f2001740cbcbe4caa07b7715f6b9a0e82a1cb784a51d53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-communication-messages \
python314-azure-communication-messages \
python3dist-azure-communication-messages"

RDEPENDS:${PN} += "-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-communication-nspkg \
python314-azure-nspkg"

inherit rpm
