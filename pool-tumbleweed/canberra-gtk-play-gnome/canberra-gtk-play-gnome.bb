SUMMARY = ".desktop links for the canberra-gtk-play utility"
DESCRIPTION = "libcanberra is an implementation of the XDG Sound Theme and Name \
Specifications, for generating event sounds on free desktops, such \
as GNOME. It comes with several backends (ALSA, PulseAudio, null) \
and is designed to be portable. \
 \
This package provides the canberra-gtk-play .desktop files for the \
gnome-desktop and gdm. \
Currently there are no desktop-login, desktop-logout or \
session-ready sounds in the freedesktop sound theme, so installing \
this will require a different sound-theme for it to be operational."
LICENSE = "LGPL-2.1-or-later"

PV = "0.30+2"

RPM_NAME = "canberra-gtk-play-gnome-0.30+2-3.6.aarch64.rpm"
RPM_HASH = "5087858f8c7767b689b73e804ee729e804637987253f85930db1ad9af4f5bf24c915b165f269702ab14108ac26255dd7966111b84bbee3c64642e03e48f08a67"

RPROVIDES:${PN} += "canberra-gtk-play-gnome \
libcanberra-gtk-gnome"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
