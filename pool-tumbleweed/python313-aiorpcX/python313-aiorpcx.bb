SUMMARY = "Generic async RPC implementation, including JSON-RPC"
DESCRIPTION = "Generic async RPC implementation, including JSON-RPC"
LICENSE = "MIT"

PV = "0.25.0"

RPM_NAME = "python313-aiorpcX-0.25.0-2.4.noarch.rpm"
RPM_HASH = "7f1c5cdedfe9d5910b86fba6737843dc746ce2533dd848530b8ab66cbf9e6be6ab50a8db46650f52295c7bf85e00838b19dd3c2e1218c37289741828d29529ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiorpcX \
python3.13dist-aiorpcx \
python313-aiorpcX \
python3dist-aiorpcx"

RDEPENDS:${PN} += "python-abi \
python313-attrs"

inherit rpm
