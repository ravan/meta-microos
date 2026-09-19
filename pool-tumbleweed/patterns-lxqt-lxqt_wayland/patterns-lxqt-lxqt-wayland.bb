SUMMARY = "LXQt Desktop Environment"
DESCRIPTION = "A complete LXQt desktop environment for Wayland"
LICENSE = "MIT"

PV = "20260223"

RPM_NAME = "patterns-lxqt-lxqt_wayland-20260223-1.2.aarch64.rpm"
RPM_HASH = "5dd84b21257094abd44e2bcfc9b0e4d723c121b99cd5b1eb961de8277c9c682317a7df0a32233efcece13a131c7e2b824e7756bf3db24863115c903010087afc"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-lxqt-lxqt-wayland"

RDEPENDS:${PN} += "kf6-breeze-icons \
libfm-qt6 \
liblxqt \
lxqt-about \
lxqt-config \
lxqt-globalkeys \
lxqt-notificationd \
lxqt-openssh-askpass \
lxqt-panel \
lxqt-policykit \
lxqt-powermanagement \
lxqt-qtplugin \
lxqt-runner \
lxqt-session \
lxqt-sudo \
lxqt-themes \
lxqt-wayland-session \
oxygen-icon-theme"

inherit rpm
