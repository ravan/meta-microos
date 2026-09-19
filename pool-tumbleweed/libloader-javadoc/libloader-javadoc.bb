SUMMARY = "Javadoc for libloader"
DESCRIPTION = "Javadoc for libloader."
LICENSE = "LGPL-2.0-only"

PV = "1.1.6"

RPM_NAME = "libloader-javadoc-1.1.6-2.9.noarch.rpm"
RPM_HASH = "721d58970e558b4dec74bcfc43a3b375940dc7f115b45043d3c76e864ec64b6ca8279af39e2f3b31a4721fc3cf769cacf60ee1cf02f6b8e54e2f781fe492f335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libloader-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
