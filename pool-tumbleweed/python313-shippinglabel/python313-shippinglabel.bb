SUMMARY = "Utilities for handling packages"
DESCRIPTION = "Utilities for handling packages."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python313-shippinglabel-2.3.0-1.4.noarch.rpm"
RPM_HASH = "1032789597ea733bc22cbfbc780c8ec57d4bbb2a3dbf349166df7cfc8c77856e88acb012629684358dcda6c389fa6ca44248f10da041be1ea33bd376eca436b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-shippinglabel \
python3.13dist-shippinglabel \
python313-shippinglabel \
python3dist-shippinglabel"

RDEPENDS:${PN} += "python-abi \
python313-dist-meta \
python313-dom-toml \
python313-domdf-python-tools \
python313-packaging \
python313-typing-extensions"

inherit rpm
