SUMMARY = "Python API / wrapper for tmux"
DESCRIPTION = "libtmux is a typed python scripting library for tmux. You can use it to command \
and control tmux servers, sessions, windows, and panes. It is the tool powering \
tmuxp, a tmux workspace manager."
LICENSE = "MIT"

PV = "0.62.0"

RPM_NAME = "python314-libtmux-0.62.0-1.1.noarch.rpm"
RPM_HASH = "47224e96e53b43916b4e7dd6be15ca9b485025542b8b7e2711e90af7706f2194eaa5f1eafe9897ecdd6b35b5cc4d7605e625a68cf607be3f40a088578bf316fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-libtmux \
python314-libtmux \
python3dist-libtmux"

RDEPENDS:${PN} += "python-abi"

inherit rpm
