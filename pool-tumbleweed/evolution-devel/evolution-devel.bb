SUMMARY = "Development files for the Evolution groupware suite"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.60.2"

RPM_NAME = "evolution-devel-3.60.2-1.2.aarch64.rpm"
RPM_HASH = "a70bec043725ee680af78da8c2a72c506a9c178c8468d7e534e896b15ab10b9d072ecfa923d6ce67a6be4ddce34740c30341e62eff658121e45b18164dff922f"

RPROVIDES:${PN} += "evolution-devel \
evolution2-devel \
pkgconfig-evolution-calendar-3.0 \
pkgconfig-evolution-mail-3.0 \
pkgconfig-evolution-shell-3.0 \
pkgconfig-libemail-engine"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
evolution \
evolution-data-server-devel \
pkgconfig-camel-1.2 \
pkgconfig-enchant-2 \
pkgconfig-evolution-shell-3.0 \
pkgconfig-gio-2.0 \
pkgconfig-gnome-desktop-3.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-gtkspell3-3.0 \
pkgconfig-gweather4 \
pkgconfig-libebackend-1.2 \
pkgconfig-libedataserver-1.2 \
pkgconfig-libedataserverui-1.2 \
pkgconfig-libemail-engine \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0 \
pkgconfig-webkit2gtk-4.1"

inherit rpm
