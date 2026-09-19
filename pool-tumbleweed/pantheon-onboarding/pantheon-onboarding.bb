SUMMARY = "Setting General Preferences"
DESCRIPTION = "Quickly change common settings on first-run."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.0"

RPM_NAME = "pantheon-onboarding-8.1.0-1.3.aarch64.rpm"
RPM_HASH = "56c2d921efd741056f10b175bcc6534371791525161cfb678e522fb9a5d02eee434606895840ebb8285d0dc87dc28cf44e449b1cd59cef92538f76f83e0aeb31"

RPROVIDES:${PN} += "elementary-onboarding \
pantheon-onboarding"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libpantheon-wayland.so.1"

inherit rpm
