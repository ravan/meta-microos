SUMMARY = "Helpful functions for Python 🐍 🛠️"
DESCRIPTION = "Helpful functions for Python 🐍 🛠️"
LICENSE = "MIT"

PV = "3.10.0"

RPM_NAME = "python313-domdf-python-tools-3.10.0-2.5.noarch.rpm"
RPM_HASH = "6de105538f6a1f45edb0e8d3e6ba8f69b4eb2a74cb5fdf4278e91719625fb9d70b5e02b91097d7203f0b41a0cf960449437fdf3c62086cbd80c1583bf2b2f543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-domdf-python-tools \
python3.13dist-domdf-python-tools \
python313-domdf-python-tools \
python3dist-domdf-python-tools"

RDEPENDS:${PN} += "python-abi \
python313-natsort \
python313-typing-extensions"

inherit rpm
