SUMMARY = "Enhanced profile and configuration utilities for GNU Screen and tmux"
DESCRIPTION = "Byobu includes an enhanced profiles, convenient keybindings, \
configuration utilities, and toggle-able system status \
notifications for both the GNU Screen window manager and tmux \
terminal multiplexer."
LICENSE = "GPL-3.0-only"

PV = "6.15"

RPM_NAME = "byobu-6.15-1.4.noarch.rpm"
RPM_HASH = "645047880c80280eee7037132fa46cf7d01185640ff76bf1e39ff8fedee607a1da081368e72ee08b33e604db8017e8b8f1f12e4de5f2c198f4a70e95d9cd44c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "byobu \
config-byobu"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
coreutils \
gawk \
gettext-runtime \
net-tools \
perl--MODULE-COMPAT-5.44.0 \
python3-newt"

inherit rpm
