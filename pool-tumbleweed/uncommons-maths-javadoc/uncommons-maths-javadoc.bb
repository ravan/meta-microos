SUMMARY = "Javadoc for uncommons-maths"
DESCRIPTION = "This package contains javadoc for uncommons-maths."
LICENSE = "Apache-2.0"

PV = "1.2.3"

RPM_NAME = "uncommons-maths-javadoc-1.2.3-3.7.noarch.rpm"
RPM_HASH = "57ebb14165199182a10ef817730b73293747e232cd27ed7c26c8faea218743cddebbe08c7fc7d5d7d7caedb17402915baa2ae7326fd44d4627046a4b70669db2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "uncommons-maths-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
