SUMMARY = "Javadoc for libfonts"
DESCRIPTION = "Javadoc for libfonts."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libfonts-javadoc-1.1.6-2.9.noarch.rpm"
RPM_HASH = "203896f1548c94b252538ae1dba3148f8cf184a503992bcf352be60389d875fd560dc2477c3bdb35aa06c76ef0debb84badb2f106612665cc1e657a7067e2a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfonts-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
