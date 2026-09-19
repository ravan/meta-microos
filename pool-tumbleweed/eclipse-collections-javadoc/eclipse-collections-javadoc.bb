SUMMARY = "API documentation for eclipse-collections"
DESCRIPTION = "API documentation for eclipse-collections."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "12.0.0"

RPM_NAME = "eclipse-collections-javadoc-12.0.0-1.4.noarch.rpm"
RPM_HASH = "e25b49a2d5b0843d7100eadd4f0449e612810c90c9379bfae05667e1537b0cc540dbdc87546dad1030f0512ef82835c2f4fcf299205b8e7037e6c5dd856da250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eclipse-collections-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
