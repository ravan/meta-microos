SUMMARY = "Component API from plexus-containers"
DESCRIPTION = "Component API from plexus-containers."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.2.0"

RPM_NAME = "plexus-containers-component-annotations-2.2.0-3.1.noarch.rpm"
RPM_HASH = "406bcb30db4ec55a3f96c6c6f03b81210bb9d48be481e9d167c5ba9f5a640a9f81c2e730d2e756574e99ea986cf8e30e629623f1c081ced46cba534d42708c52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-component-annotations-pom- \
osgi-org.codehaus.plexus.component-annotations \
plexus-containers-component-annotations"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
