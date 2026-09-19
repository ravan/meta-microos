SUMMARY = "Javadoc for xmlgraphics-commons"
DESCRIPTION = "Javadoc for package xmlgraphics-commons."
LICENSE = "Apache-2.0"

PV = "2.11"

RPM_NAME = "xmlgraphics-commons-javadoc-2.11-1.2.noarch.rpm"
RPM_HASH = "b5c3001c7f5b879beed0cfb3a3ab847fbf79841868bd152386c50f7704d0713aba3297d1d7ef61ec70b9e856e363c9976135592221420c823a87af83c048224f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmlgraphics-commons-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
