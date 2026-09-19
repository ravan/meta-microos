SUMMARY = "GUI tool to set individual hardware stream volumes"
DESCRIPTION = "This tool allows you to control the volume of individual streams on \
sound cards that use hardware mixing, i.e., those based on the \
following chips: Creative Emu10k1, VIA VT823x southbridge, Yamaha DS-1"
LICENSE = "GPL-2.0-or-later"

PV = "0.9"

RPM_NAME = "hwmixvolume-0.9-29.4.aarch64.rpm"
RPM_HASH = "015b887349576c8981a48ecafea8cde5a1298d136ab8bddcd6b371342fdf5ac3d546f5a48e9d56bf932c868645d68f785fd7b4985f81d861a824d2d9868fe61b"

RPROVIDES:${PN} += "alsa-tools-gui \
hwmixvolume"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
python3-alsa \
typelib-GLib \
typelib-Gtk"

inherit rpm
