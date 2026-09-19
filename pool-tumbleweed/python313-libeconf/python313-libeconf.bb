SUMMARY = "Python bindings for libeconf"
DESCRIPTION = "Python bindings for libeconf"
LICENSE = "MIT"

PV = "0.8.4"

RPM_NAME = "python313-libeconf-0.8.4-1.1.noarch.rpm"
RPM_HASH = "1edd53773c2d90f6cbfcc90dc08d9dce4b3f5331ff39e0f1112ad5711352305e9e12029ab8c1e30b2ae5d382eb6cb372200ccd21b18ac3e1eb0d5d6c2f9675ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libeconf \
python3.13dist-python-libeconf \
python313-libeconf \
python3dist-python-libeconf"

RDEPENDS:${PN} += "libeconf0 \
python-abi"

inherit rpm
