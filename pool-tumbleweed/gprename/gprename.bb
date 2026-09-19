SUMMARY = "A GTK3 batch renamer for files and directories"
DESCRIPTION = "GPRename is a complete GTK3/perl batch renamer for files and directories."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.20230429"

RPM_NAME = "gprename-5.0.20230429-1.9.noarch.rpm"
RPM_HASH = "3e3a14b8f617a320774dd094bc2f7cddda78b6d6f930d6a00ea6a90b6961f9a4fc4c19a6395be9da9413b029bf6d0e4cfaf9ab8e5b28f388ddb19289bb383298"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gprename"

RDEPENDS:${PN} += "/usr/bin/perl \
perl-Gtk3 \
perl-Pango \
perl-gettext \
perl-libintl-perl \
pkgconfig-gdk-pixbuf-2.0"

inherit rpm
