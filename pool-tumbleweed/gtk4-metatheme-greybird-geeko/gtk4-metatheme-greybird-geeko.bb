SUMMARY = "GTK+ 4 support for the Greybird-geeko theme"
DESCRIPTION = "This package provides the GTK+ 4 support of Greybird-geeko."
LICENSE = "(CC-BY-SA-3.0 & GPL-3.0-or-later) | GPL-2.0-or-later"

PV = "3.23.4+git0.c1d46c3"

RPM_NAME = "gtk4-metatheme-greybird-geeko-3.23.4+git0.c1d46c3-1.5.noarch.rpm"
RPM_HASH = "a16d762147bce87919e0b0b7a5c2d119a7815f8d6d35486dd7cf78ca9332897a6e71016df770d83affdc3f864297b392861d247395d580b6c37097218b343d99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-greybird-geeko"

RDEPENDS:${PN} += "metatheme-greybird-geeko-common"

inherit rpm
