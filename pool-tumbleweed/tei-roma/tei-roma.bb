SUMMARY = "TEI Schema or DTD Generator"
DESCRIPTION = "Roma is a shell script and XSL stylesheets for building a customized \
TEI schema or DTD.  It uses xsltproc, trang, and Perl."
LICENSE = "GPL-2.0-or-later"

PV = "2.11"

RPM_NAME = "tei-roma-2.11-81.7.noarch.rpm"
RPM_HASH = "3a9999d209a4d3597e39275e6aa12cfeb71e430c7b7d00ff3efd9fd71269b065712a1893983ea033112ca51f524edc8073b2f40c2c89e6a868491a69d4a993a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tei-roma"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/xsltproc \
perl \
trang"

inherit rpm
