SUMMARY = "Javadoc for maven-wagon"
DESCRIPTION = "Javadoc for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-javadoc-3.5.3-2.9.noarch.rpm"
RPM_HASH = "b8bec1557f52f955f9ea6f8d546cbbd917dc52ce949256bef3976c121765d96d91bfa6f441b3f67d2f0167c49590c4b13be3f1323f5a3333be6287cfeaccc8d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
