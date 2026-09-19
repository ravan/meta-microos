SUMMARY = "Javadoc for jakarta-commons-discovery"
DESCRIPTION = "This package contains the javadoc documentation for jakarta-commons-discovery."
LICENSE = "Apache-2.0"

PV = "0.5"

RPM_NAME = "jakarta-commons-discovery-javadoc-0.5-2.7.noarch.rpm"
RPM_HASH = "42c1cea496c673439af5822d05b548a3f11dd13bbefc6e6363ecbcc3ae97c69c2f2c2f8bb8e33eeda9f5ef2168a524ed42b3bd74ab2ceb1e5ae0ecb442601f08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-discovery-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
