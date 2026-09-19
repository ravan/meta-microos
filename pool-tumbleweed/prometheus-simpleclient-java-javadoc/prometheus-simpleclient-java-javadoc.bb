SUMMARY = "Javadoc for prometheus-simpleclient-java"
DESCRIPTION = "This package contains javadoc for prometheus-simpleclient-java."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.16.0"

RPM_NAME = "prometheus-simpleclient-java-javadoc-0.16.0-2.2.noarch.rpm"
RPM_HASH = "db15309eb21d871ec5e7c1db3cb923d4a90f701c3fdcf733afe7447f3b4523de6a752e499f2f56eb8a46a47732ae57e054fe339fdd0f22dce0cfdd353fca493f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "prometheus-simpleclient-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
