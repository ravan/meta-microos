SUMMARY = "Javadoc for univocity-parsers"
DESCRIPTION = "API documentation for univocity-parsers."
LICENSE = "Apache-2.0"

PV = "2.9.1"

RPM_NAME = "univocity-parsers-javadoc-2.9.1-4.8.noarch.rpm"
RPM_HASH = "7bdd28d1e9eaf5e568c05167ad417b3521140bf0cce31e9c575a828c076b79bf3bcc85d602e834a7c687b0b29055e6f741bdd50cf46d529f476555dbf1007d8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "univocity-parsers-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
