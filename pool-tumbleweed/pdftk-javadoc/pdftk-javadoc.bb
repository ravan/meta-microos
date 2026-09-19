SUMMARY = "API documentation for pdftk"
DESCRIPTION = "API documentation for pdftk."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.3"

RPM_NAME = "pdftk-javadoc-3.3.3-3.10.noarch.rpm"
RPM_HASH = "14e178446dba01a9d652998456825b222df1df807a9574935eba0aee6cf1146f939f2be991dc404472c8e3791a4376472f198ee6a2e1cb19dbf1acfd81b4a27d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pdftk-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
