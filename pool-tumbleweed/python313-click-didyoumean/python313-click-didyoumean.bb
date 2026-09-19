SUMMARY = "Plugin to enable git-like did-you-mean feature in python-click"
DESCRIPTION = "This package enables a git-like did-you-mean feature in click."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python313-click-didyoumean-0.3.1-1.9.noarch.rpm"
RPM_HASH = "9d9f4ec11c96ba4ab5439fa9de44032773277623049d835a7e3e3d561d495c444d84adbacaab33a9f64be182991598ee8990352f2edd1e4fa87af00fa9e45dca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-click-didyoumean \
python3.13dist-click-didyoumean \
python313-click-didyoumean \
python3dist-click-didyoumean"

RDEPENDS:${PN} += "python-abi \
python313-click"

inherit rpm
