SUMMARY = "HTML syntax checker and pretty printer"
DESCRIPTION = "JTidy is a Java port of HTML Tidy, a HTML syntax checker and pretty \
printer. Like its non-Java cousin, JTidy can be used as a tool for \
cleaning up malformed and faulty HTML. In addition, JTidy provides a \
DOM parser for real-world HTML."
LICENSE = "HTMLTIDY"

PV = "1.0.4"

RPM_NAME = "jtidy-scripts-1.0.4-3.11.noarch.rpm"
RPM_HASH = "d54e011075122cdeba1ce49ef670880810397a1fdc1efe1c439f3c0e3e196984e5fd8f7f00f8cbdf77f0cf143c20e52804b53b52f8a1188f514a8a845b366f63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jtidy-scripts"

RDEPENDS:${PN} += "/usr/bin/bash \
javapackages-tools \
jtidy"

inherit rpm
