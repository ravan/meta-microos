SUMMARY = "Program to fill the console with Hollywood melodrama technobabble"
DESCRIPTION = "This utility will split the console into a multiple panes of genuine \
technobabble, perfectly suitable for any Hollywood geek melodrama. \
It is particularly suitable on any number of computer consoles in the \
background of any excellent schlock technothriller."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "1.25"

RPM_NAME = "hollywood-1.25-1.2.noarch.rpm"
RPM_HASH = "4fc073e89d6678dc43f16b1bfb996425fb0f38495e0f8e295a6e612a6f6d33cbe78ea3b6c6cdf126f6541a109b5f9c5c5908d3f903835d93ad8c5acca449895a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hollywood"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
hollywood-data \
man \
moreutils \
python3-Pygments \
tmux"

inherit rpm
