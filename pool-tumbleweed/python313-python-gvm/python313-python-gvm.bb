SUMMARY = "Library to communicate with remote servers over GMP or OSP"
DESCRIPTION = "The Greenbone Vulnerability Management Python API library python-gvm is a \
collection of APIs that help with remote controlling a Greenbone Security \
Manager (GSM) appliance and its underlying Greenbone Vulnerability Manager \
(GVM). The library essentially abstracts accessing the communication protocols \
Greenbone Management Protocol (GMP) and Open Scanner Protocol (OSP)."
LICENSE = "GPL-3.0-only"

PV = "26.11.0"

RPM_NAME = "python313-python-gvm-26.11.0-1.3.noarch.rpm"
RPM_HASH = "484f8c135ac9b709ecccd3e3aba5518b17b10b0c1ae1b56f54454c645cb4554f8d824d3024f96a72a0375e37510c8b06d18f1ebd8de8e7d393c506600aba7b40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-gvm \
python3.13dist-python-gvm \
python313-python-gvm \
python3dist-python-gvm"

RDEPENDS:${PN} += "python-abi \
python313-lxml \
python313-paramiko"

inherit rpm
