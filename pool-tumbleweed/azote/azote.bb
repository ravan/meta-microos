SUMMARY = "Wallpaper manager for Sway, i3 and some other WMs"
DESCRIPTION = "Azote is a GTK+ 3-based picture browser and a wallpaper setter, as the frontend to the swaybg (Sway/Wayland) and feh (X windows) commands."
LICENSE = "GPL-3.0-only"

PV = "1.16.0"

RPM_NAME = "azote-1.16.0-1.4.noarch.rpm"
RPM_HASH = "a28367a8e9b0b0f66c6bf9c2be88b80e51f92f550d2977456495fe75d243c1c0fb130ad8484b84683c305029a47aba6fe346819bcce67d77867e5a168b44045d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "azote \
python3.13dist-azote \
python3dist-azote"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ImageMagick \
feh \
python-abi \
python3-Pillow \
python3-PyYAML \
python3-Send2Trash \
python3-gobject \
python3-gobject-Gdk \
typelib-AppIndicator3 \
typelib-AyatanaAppIndicator3 \
typelib-GLib \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gtk \
wget \
wmctrl \
xrandr"

inherit rpm
