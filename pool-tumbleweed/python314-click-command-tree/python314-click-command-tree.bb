SUMMARY = "Plugin for click to show the command tree of your CLI"
DESCRIPTION = "click-command-tree is a click plugin to show the command tree of your CLI"
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python314-click-command-tree-1.2.0-1.9.noarch.rpm"
RPM_HASH = "532ef60d279979e5dbd0274e1089ace3cb7e797554fe52a9df21e35297b1a3b98e30eac3fe18a43d40fec6bda16d5d60dfc5b5f0c96703c8776e129eade9186d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-click-command-tree \
python314-click-command-tree \
python3dist-click-command-tree"

RDEPENDS:${PN} += "python-abi \
python314-click"

inherit rpm
