SUMMARY = "XDG Menus for WindowMaker and other Window Managers"
DESCRIPTION = "This package contains a Perl script which converts XDG menus to formats \
used by WindowMaker and other window managers."
LICENSE = "GPL-2.0-or-later"

PV = "0.2"

RPM_NAME = "xdg-menu-0.2-219.7.noarch.rpm"
RPM_HASH = "61f23c02a6be704b6901521720818a2c62ee4e2dde45937307af557645fa1e997ffdcb6f2e8a7a34df07eacbba49d72643ff1ef951823d0a74c2a85c487afd04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xdg-menu"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
desktop-data \
perl-Locale--gettext \
perl-XML-Parser \
xterm-bin"

inherit rpm
