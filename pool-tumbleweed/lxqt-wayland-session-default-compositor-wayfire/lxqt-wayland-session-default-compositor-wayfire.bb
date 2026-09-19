SUMMARY = "Sets default compositor to wayfire"
DESCRIPTION = "Sets the default compositor to miriway, and provides the miriway session setup"
LICENSE = "GPL-3.0-or-later"

PV = "0.4.1"

RPM_NAME = "lxqt-wayland-session-default-compositor-wayfire-0.4.1-1.2.noarch.rpm"
RPM_HASH = "3c97532e200673cabdfb8f80856b4eed9f30b5d8fde76de31ca94389ac1b8ee3fc73a0eebcdd1107eab2d0fbd3e9e5656666695aa674ac36ed54193753ae2aff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-wayland-session-default-compositor \
lxqt-wayland-session-default-compositor-wayfire"

RDEPENDS:${PN} += "lxqt-wayfire-session \
lxqt-wayland-session"

inherit rpm
