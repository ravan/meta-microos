SUMMARY = "Common scripts and macros to develop with MATE"
DESCRIPTION = "mate-common is an extension to autoconf, automake and libtool for the MATE \
desktop environment and MATE applications. mate-autogen, and several macros are \
included to help in MATE source trees."
LICENSE = "GPL-3.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-common-1.28.0-1.8.noarch.rpm"
RPM_HASH = "b6df4113cf2add710e65989e96e1c5df1f3ebae35778660435e48b1d9e49511ecd5dd3b04bfca3a50eda6cd290b44f078268b7aa578486331c7ad8414e055671"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mate-common"

RDEPENDS:${PN} += "/usr/bin/sh \
autoconf \
autoconf-archive \
automake \
gettext \
libtool \
pkgconfig \
pkgconfig-glib-2.0 \
pkgconfig-gtk-doc"

inherit rpm
