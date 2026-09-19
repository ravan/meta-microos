SUMMARY = "A simple Python wheel builder for simple projects"
DESCRIPTION = "A simple Python wheel builder for simple projects."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python313-whey-0.1.1-5.2.noarch.rpm"
RPM_HASH = "79d524b7cfa17ea17daa8e69feca8a79d936543db03fa423c2a3885bc345ee86f973a85d2a3e4456ef42c3c46c8449ee14339a119c9c891f8d98b4cbff5b52d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-whey \
python3.13dist-whey \
python313-whey \
python3dist-whey"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-attrs \
python313-click \
python313-consolekit \
python313-dist-meta \
python313-dom-toml \
python313-domdf-python-tools \
python313-handy-archives \
python313-natsort \
python313-packaging \
python313-pyproject-parser \
python313-shippinglabel"

inherit rpm
