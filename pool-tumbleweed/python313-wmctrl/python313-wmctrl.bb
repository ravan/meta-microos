SUMMARY = "Python programmatic control of X windows"
DESCRIPTION = "Python tool to programmatically control windows inside X."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python313-wmctrl-0.5-3.5.noarch.rpm"
RPM_HASH = "56095c79a340b537158aa75a72b3ab6dbd36270333220413219c8cdfc6e6af11486973b72a747e1729a20a58427750a63ce4fa2d3a7a7e6695d21e4fe08cd2e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wmctrl \
python3.13dist-wmctrl \
python313-wmctrl \
python3dist-wmctrl"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
wmctrl \
xorg-x11-server"

inherit rpm
