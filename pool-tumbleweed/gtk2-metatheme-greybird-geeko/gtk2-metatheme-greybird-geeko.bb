SUMMARY = "GTK+ 2 support for the Greybird theme"
DESCRIPTION = "This package provides the GTK+ 2 support of Greybird-geeko."
LICENSE = "(CC-BY-SA-3.0 & GPL-3.0-or-later) | GPL-2.0-or-later"

PV = "3.23.4+git0.c1d46c3"

RPM_NAME = "gtk2-metatheme-greybird-geeko-3.23.4+git0.c1d46c3-1.5.noarch.rpm"
RPM_HASH = "940bcde694c02963dd774a80fe3a6fa7da396b25d1fefbc24095b92ffecfa73c51283434e238fbb39c52d5f9876d3acd1d8500601241e6dbaaf1988b799ee7c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-greybird-geeko"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-greybird-geeko-common"

inherit rpm
