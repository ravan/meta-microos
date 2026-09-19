SUMMARY = "Javadoc for jdepend"
DESCRIPTION = "This package contains the API documentation for jdepend."
LICENSE = "MIT"

PV = "2.10"

RPM_NAME = "jdepend-javadoc-2.10-4.9.noarch.rpm"
RPM_HASH = "0fe5072ef722037a1461793dc921d2bdd37879ddb8fcba26b8707429167f64457c41fbe103fd33adab8f3e604894dfefe2578e6e8d51655a067cb958ebcad425"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jdepend-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
