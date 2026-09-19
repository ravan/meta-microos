SUMMARY = "KDE Plasma 6 Session"
DESCRIPTION = "This package contains the startup scripts necessary to start a KDE \
Plasma 6 session."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plasma6-session-6.7.5-1.1.noarch.rpm"
RPM_HASH = "97800227b67104d42869bf1a44366eb6186f8dab0fcdc698b967f9eb682b3727d08fe3a80559c1f6fafcdf44ec12d95052bd204556b9af262cf61a6670e0df80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdebase4-session \
plasma5-session \
plasma5-session-wayland \
plasma6-session"

RDEPENDS:${PN} += "breeze6 \
breeze6-decoration \
kf6-kwindowsystem \
pipewire \
plasma6-desktop \
plasma6-workspace \
polkit-kde-agent-6 \
powerdevil6 \
qt6-wayland \
systemsettings6 \
xdg-user-dirs \
xorg-x11-server-wayland"

inherit rpm
