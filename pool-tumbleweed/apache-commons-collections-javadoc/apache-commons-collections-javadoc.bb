SUMMARY = "Javadoc for apache-commons-collections"
DESCRIPTION = "Javadoc for apache-commons-collections."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "apache-commons-collections-javadoc-3.2.2-9.10.noarch.rpm"
RPM_HASH = "bf0efa63cb27ee39f81ef35958a8f3a03f36cdcb36953808aa8719bfc1c50b17caddc578c7ba8ed6fe141de0939785ea5cdd53bf30107ab74eb9c566272d8573"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-collections-javadoc \
apache-commons-collections-testframework-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
