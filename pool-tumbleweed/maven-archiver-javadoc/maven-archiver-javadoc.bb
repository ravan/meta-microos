SUMMARY = "Javadoc for maven-archiver"
DESCRIPTION = "Javadoc for maven-archiver."
LICENSE = "Apache-2.0"

PV = "3.6.6"

RPM_NAME = "maven-archiver-javadoc-3.6.6-1.4.noarch.rpm"
RPM_HASH = "b59cdd4f9a5a5dc143c53a1b3bd6ce296cc4bef624948ef4b134be02cc5324053978d61bbccaaf23b21bc288c4fe046582c9bb75b033a194ba7cb153941a64aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-archiver-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
