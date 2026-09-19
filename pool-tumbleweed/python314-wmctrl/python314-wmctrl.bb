SUMMARY = "Python programmatic control of X windows"
DESCRIPTION = "Python tool to programmatically control windows inside X."
LICENSE = "MIT"

PV = "0.5"

RPM_NAME = "python314-wmctrl-0.5-3.5.noarch.rpm"
RPM_HASH = "f22cc5e5561bbb85588a6773b8ae3e9bb2c6feac334403dc72ef5f61a863fa7e9674da6b9cc20c29095d6d95a24f1bdd16f3ec92277c5bafe7d81969c1845a9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wmctrl \
python314-wmctrl \
python3dist-wmctrl"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
wmctrl \
xorg-x11-server"

inherit rpm
