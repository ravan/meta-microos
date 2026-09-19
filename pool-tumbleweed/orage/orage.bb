SUMMARY = "Time-managing Application for the Xfce Desktop Environment"
DESCRIPTION = "Orage is a fast and easy to use graphical calendar for the Xfce desktop \
environment. It uses the portable ical format and includes common calendar \
features like repeating appointments and multiple alarming possibilities. Orage \
does not have group calendar features and can only be used for single user."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.3"

RPM_NAME = "orage-4.20.3-1.3.aarch64.rpm"
RPM_HASH = "ca142efebda313f3f827222d92c223099a50394194f7b891835381796f86ab2be74d3117ef09510720e685a668acddcf36dc73b90217155c95a61f56dd8fbb62"

RPROVIDES:${PN} += "orage \
orage-doc \
xfcalendar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libical.so.3 \
libicalss.so.3 \
libnotify.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7"

inherit rpm
