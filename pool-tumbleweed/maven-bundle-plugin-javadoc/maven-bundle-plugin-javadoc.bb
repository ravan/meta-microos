SUMMARY = "Javadoc for maven-bundle-plugin"
DESCRIPTION = "API documentation for maven-bundle-plugin."
LICENSE = "Apache-2.0"

PV = "6.2.0"

RPM_NAME = "maven-bundle-plugin-javadoc-6.2.0-1.1.noarch.rpm"
RPM_HASH = "abff6a751b5340dcdf5749eae60f5259be3f7e5eb35ddf20b9b8d2aa1e777d606c2cf3a92b08a4870350a862d53a923aecc14ad903dcfc77949ec0493a7a1a6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-bundle-plugin-javadoc \
maven-plugin-bundle-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
