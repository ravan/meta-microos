SUMMARY = "HTML syntax checker and pretty printer"
DESCRIPTION = "JTidy is a Java port of HTML Tidy, a HTML syntax checker and pretty \
printer. Like its non-Java cousin, JTidy can be used as a tool for \
cleaning up malformed and faulty HTML. In addition, JTidy provides a \
DOM parser for real-world HTML."
LICENSE = "HTMLTIDY"

PV = "1.0.4"

RPM_NAME = "jtidy-1.0.4-3.11.noarch.rpm"
RPM_HASH = "a71fa348fcadf86e1e2bc58f9eea994641354c91e94ce2437075265f0b307ff493f109ff6d4e797e5cd8a52fa7803e72455cea9826b3c0792b1b6c411767dc4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-jtidy \
jtidy \
mvn-com.github.jtidy-jtidy \
mvn-com.github.jtidy-jtidy-pom- \
mvn-net.sf.jtidy-jtidy \
mvn-net.sf.jtidy-jtidy-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
xerces-j2 \
xml-apis"

inherit rpm
