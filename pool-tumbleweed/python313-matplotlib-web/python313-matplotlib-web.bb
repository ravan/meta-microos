SUMMARY = "Web backend for python313-matplotlib"
DESCRIPTION = "This package includes the browser-based webagg backend \
for the python313-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.10.9"

RPM_NAME = "python313-matplotlib-web-3.10.9-2.2.aarch64.rpm"
RPM_HASH = "e2a28a79d6605df8f50fe450c26a4fa3e3963042162b7be8c5951d9192fb50acd825a856ccaf7e01085cb9b26b961171af0d904d930d21e3cbef6f0fca4975b4"

RPROVIDES:${PN} += "python3-matplotlib-web \
python313-matplotlib-web"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib \
python313-tornado"

inherit rpm
