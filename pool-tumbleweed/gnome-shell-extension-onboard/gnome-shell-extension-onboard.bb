SUMMARY = "GNOME Shell extension for onboard, an on-screen keyboard"
DESCRIPTION = "Onboard is an onscreen keyboard useful for tablet PC users and for mobility impaired users. \
 \
This GNOME Shell extension integrates the onboard keyboard with the GNOME Shell."
LICENSE = "GPL-3.0-only"

PV = "1.4.4.5"

RPM_NAME = "gnome-shell-extension-onboard-1.4.4.5-2.1.noarch.rpm"
RPM_HASH = "0748083251dd3cc88cfb7005837bc74e974dc9e37b81627359a2cf884bd16108adb7f5a4ef4c59fd71bdd04ae06ffe53047ebacc791d8f82db8090695dafa4a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-onboard"

RDEPENDS:${PN} += "gnome-shell \
onboard \
typelib-Adw \
typelib-Clutter \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Meta \
typelib-Shell \
typelib-St"

inherit rpm
