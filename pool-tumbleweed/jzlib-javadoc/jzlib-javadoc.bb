SUMMARY = "API documentation for jzlib"
DESCRIPTION = "API documentation for jzlib."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "jzlib-javadoc-1.1.3-6.9.noarch.rpm"
RPM_HASH = "68f1c282868e182041328ce9c67e52a034a161d905d1798cd5a895fd6da8ad22d35eed9c8e3d6463f4038023cabd066e02b0c1c96b29ee8608190db62c3664c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jzlib-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
