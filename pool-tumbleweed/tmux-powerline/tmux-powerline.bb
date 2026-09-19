SUMMARY = "Powerline for tmux"
DESCRIPTION = "Powerline for tmux. \
 \
Add \
 \
    source /usr/share/tmux/powerline.conf \
 \
to your ~/.tmux.conf file."
LICENSE = "MIT"

PV = "2.8.4"

RPM_NAME = "tmux-powerline-2.8.4-3.5.noarch.rpm"
RPM_HASH = "983a16e31ffe3771de17c3f57c3f80a058f8cf85279e9aa1174040d6dd6fada7f4de618559150158e949e2bf683ecf8c57f3fc1767b39eb1cf68e02fbfae7d6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tmux-powerline"

RDEPENDS:${PN} += "powerline \
tmux"

inherit rpm
