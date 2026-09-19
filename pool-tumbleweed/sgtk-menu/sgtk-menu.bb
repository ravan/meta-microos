SUMMARY = "GTK menu for sway and i3"
DESCRIPTION = "An attempt to create a simple menu, that behaves decently on sway, \
but also on i3 window manager. It uses pygobject to create a themeable, \
searchable gtk3-based system menu w/ some optional features."
LICENSE = "GPL-3.0-only"

PV = "1.4.1"

RPM_NAME = "sgtk-menu-1.4.1-2.7.aarch64.rpm"
RPM_HASH = "77c45744c8fb121fe0d376349c08dccddd533cf58e797b4f5a992c792ca3757ea48fe96716ed289105a6dbcdcde6c3d5a5089df0cddd5310f2a6e2d961feb228"

RPROVIDES:${PN} += "python3.13dist-sgtk-menu \
python3dist-sgtk-menu \
sgtk-menu"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-gobject"

inherit rpm
