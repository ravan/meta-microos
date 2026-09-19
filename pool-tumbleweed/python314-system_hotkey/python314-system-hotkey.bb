SUMMARY = "System wide hotkeys"
DESCRIPTION = "System wide hotkeys for python 3."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python314-system_hotkey-1.0.3-2.5.noarch.rpm"
RPM_HASH = "1da837409902cfbc406cd02e8855e57dcd5d36f2e76e9be3b005c6ef100658cf359370b4c30cad2947d51bce7dcab2f79691b4de6702cb10b8df5c7f36be71b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-system-hotkey \
python314-system-hotkey \
python3dist-system-hotkey"

RDEPENDS:${PN} += "python-abi \
python314-xcffib \
python314-xpybutil"

inherit rpm
