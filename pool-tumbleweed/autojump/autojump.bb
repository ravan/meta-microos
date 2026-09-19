SUMMARY = "A faster way to navigate the filesystem from a shell"
DESCRIPTION = "autojump is a faster way to navigate one's filesystem. It works by \
maintaining a database of the directories one uses the most from \
the command line. \
 \
Directories must be visited first before they can be jumped to."
LICENSE = "GPL-3.0-or-later"

PV = "22.5.3"

RPM_NAME = "autojump-22.5.3-3.7.noarch.rpm"
RPM_HASH = "9671494ff24f030926dd6d8fec0994cbb2752888cad864f50f3a0d846a6de5873f3cabb5832176c712965512670bafaf84d7b44c4e18e2f61789ae319942e467"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "autojump \
config-autojump"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
