SUMMARY = "Format click help output nicely with rich"
DESCRIPTION = "Format click help output nicely with rich."
LICENSE = "MIT"

PV = "1.9.8"

RPM_NAME = "python313-rich-click-1.9.8-1.2.noarch.rpm"
RPM_HASH = "a7ad748d56c17c067387d33659736a92c8dc394248e4c2cf15d5bda3e92bb9a520ac7f0ee29881001c7d27ab1fe0181277e4a279d56c55380ff27d0a30d9fd5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rich-click \
python3.13dist-rich-click \
python313-rich-click \
python3dist-rich-click"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-click \
python313-rich"

inherit rpm
