SUMMARY = "Translation of man pages in Macedonian"
DESCRIPTION = "This package provides translations of man pages in Macedonian."
LICENSE = "GPL-3.0-or-later"

PV = "4.31.0"

RPM_NAME = "man-pages-mk-4.31.0-1.2.noarch.rpm"
RPM_HASH = "053d45de90bc11c6925b15b98cf4501657cf61903224d04d382345beb843dbe80e562443fafbf805d7dad46e281dad98b87d3ffe4fb747ac4878661bae8e0ac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-man-pages-mk \
man-pages-mk"

RDEPENDS:${PN} += "man-pages"

inherit rpm
