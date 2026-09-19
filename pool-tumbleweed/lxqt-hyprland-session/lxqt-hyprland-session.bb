SUMMARY = "Session files for LXQt-Hyprland"
DESCRIPTION = "This package contains the files necessary to use Hyprland as the Wayland \
compositor with LXQt"
LICENSE = "BSD-3-Clause"

PV = "0.4.1"

RPM_NAME = "lxqt-hyprland-session-0.4.1-1.2.noarch.rpm"
RPM_HASH = "e23e8741868c5ff36bcc2d9465194a314643a251ced94a99372599cffd7cc06eee983e674887a82b81a261fb97fca7f8e2da216facead5ee417a25b1b6ec9c88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-hyprland-session"

RDEPENDS:${PN} += "hyprland \
hyprland-qtutils \
lxqt-wayland-session"

inherit rpm
