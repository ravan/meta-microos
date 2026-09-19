SUMMARY = "HTML syntax checker and pretty printer"
DESCRIPTION = "JTidy is a Java port of HTML Tidy, a HTML syntax checker and pretty \
printer. Like its non-Java cousin, JTidy can be used as a tool for \
cleaning up malformed and faulty HTML. In addition, JTidy provides a \
DOM parser for real-world HTML."
LICENSE = "HTMLTIDY"

PV = "1.0.4"

RPM_NAME = "jtidy-javadoc-1.0.4-3.11.noarch.rpm"
RPM_HASH = "c95322ecd04445634146f3cc009f71b0e5b5ba6e0dd199df375eed274163330acc19a788c9354719b3a5dc568bb2f976d9c7b69444faa8a1dd442b00d7dfd2e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jtidy-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
