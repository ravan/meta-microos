SUMMARY = "API documentation for jgraphx"
DESCRIPTION = "API documentation for jgraphx."
LICENSE = "BSD-3-Clause"

PV = "4.2.2"

RPM_NAME = "jgraphx-javadoc-4.2.2-3.8.noarch.rpm"
RPM_HASH = "5593b4ec18fccf16a9a52c3b21897faf4243645a76b8e6e5a859d19885f031f07bae13bbfc4d0300414c73c8177621c7b0a65f99b7ab34979cf14982d34b6b6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jgraphx-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
