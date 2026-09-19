SUMMARY = "A sendto integration for Nautilus"
DESCRIPTION = "This package add sendto integration for Nautilus."
LICENSE = "GPL-3.0-only"

PV = "2.4.6"

RPM_NAME = "nautilus-extension-sendto-blueman-2.4.6-1.5.noarch.rpm"
RPM_HASH = "9404aac9f9fdf4efe93c89c5d3d711c76e23e6849c428e20aa269026d996c473f0e5b1cf735f572f0f51f97a84c7cdf6fb503f7e599bd68a4ba5d42206a7d611"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nautilus-extension-sendto-blueman"

RDEPENDS:${PN} += "blueman \
typelib-GObject \
typelib-Gio \
typelib-Nautilus"

inherit rpm
