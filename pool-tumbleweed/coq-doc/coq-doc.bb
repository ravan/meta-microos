SUMMARY = "Documentation for coq"
DESCRIPTION = "HTML reference manual for Coq and full documentation of the standard library."
LICENSE = "LGPL-2.1-only"

PV = "8.20.1"

RPM_NAME = "coq-doc-8.20.1-1.5.noarch.rpm"
RPM_HASH = "1b092d1aff3238eaed8abe319b28b6656c8ef69848267f328d1f83d291c5cac1a73c9f078ef05a445ac6900510e3fcbba50465e77d5d47976b34b007e10516d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "coq-doc"

RDEPENDS:${PN} += "coq"

inherit rpm
