SUMMARY = "GIMP extensions for Inkscape"
DESCRIPTION = "The GIMP import and export extensions for Inkscape. \
 \
Inkscape is a vector graphics editor."
LICENSE = "GPL-3.0-only"

PV = "1.4.4+git2.3454cb1dab"

RPM_NAME = "inkscape-extensions-gimp-1.4.4+git2.3454cb1dab-1.2.aarch64.rpm"
RPM_HASH = "2897d14f7ff3b4a2ac35cfd8617b32c81f6b6a0483e685618272577d9c45421036bc299e7ac589e81d3f34b55d054713fac6b8cd170af1572e926cb7a6ccd909"

RPROVIDES:${PN} += "inkscape-extensions-gimp"

RDEPENDS:${PN} += "gimp \
inkscape \
inkscape-extensions-extra"

inherit rpm
