SUMMARY = "Python API / wrapper for tmux"
DESCRIPTION = "libtmux is a typed python scripting library for tmux. You can use it to command \
and control tmux servers, sessions, windows, and panes. It is the tool powering \
tmuxp, a tmux workspace manager."
LICENSE = "MIT"

PV = "0.62.0"

RPM_NAME = "python313-libtmux-0.62.0-1.1.noarch.rpm"
RPM_HASH = "08ced703ad6fc9d874934e85875358c481c03248e58a02b68c27dddb015b81953525570357f2a834e29881139478dedadd1f00b98c581ca5ae5fc660538cd7f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libtmux \
python3.13dist-libtmux \
python313-libtmux \
python3dist-libtmux"

RDEPENDS:${PN} += "python-abi"

inherit rpm
