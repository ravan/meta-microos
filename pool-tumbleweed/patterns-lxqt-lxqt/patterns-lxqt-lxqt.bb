SUMMARY = "LXQt Desktop Environment"
DESCRIPTION = "LXQt is a lightweight desktop environment based on Qt."
LICENSE = "MIT"

PV = "20260223"

RPM_NAME = "patterns-lxqt-lxqt-20260223-1.2.aarch64.rpm"
RPM_HASH = "ad9f5551e98e14ccaffa1b8662669a285930d3a6cde8c4913825ec70e06a862c62394bc8dabb14d47a4f0015b8cfdfe97b6c1295743e2b9760447a691b784b1b"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-lxqt-lxqt"

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
oxygen-icon-theme \
pattern-"

inherit rpm
