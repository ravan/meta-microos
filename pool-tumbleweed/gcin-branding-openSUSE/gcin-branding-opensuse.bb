SUMMARY = "openSUSE branding of gcin"
DESCRIPTION = "This package provides openSUSE Look and Feel for gcin"
LICENSE = "LGPL-2.1"

PV = "12.1"

RPM_NAME = "gcin-branding-openSUSE-12.1-10.48.noarch.rpm"
RPM_HASH = "c347349d01cce2551749c46483e7fdc4085415109440fe349762bda5023f5cc579faa1f45924ac1677c81b8c4390b90ba0ecc8e6c3860846e35a508570d2db8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcin-branding \
gcin-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
gcin"

inherit rpm
