SUMMARY = "API documentation for jflex"
DESCRIPTION = "This package provides API documentation for jflex."
LICENSE = "BSD-3-Clause"

PV = "1.9.1"

RPM_NAME = "jflex-javadoc-1.9.1-1.5.noarch.rpm"
RPM_HASH = "b0e813046095e9cefa37ab4283234cb2aaef904c4a00613c2436749cb9775f961ed7a2d6ce57e86fa71c76dd63bdd9a2ea05d035df7a3f21c276fa2a743c83eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jflex-doc \
jflex-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
