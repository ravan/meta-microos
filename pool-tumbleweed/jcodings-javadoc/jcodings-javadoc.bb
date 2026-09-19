SUMMARY = "API documentation for jcodings"
DESCRIPTION = "API documentation for jcodings."
LICENSE = "MIT"

PV = "1.0.58"

RPM_NAME = "jcodings-javadoc-1.0.58-1.5.noarch.rpm"
RPM_HASH = "9b8bb5595d8d4a33382f4fa4886fcb797a55584f9a8e11cb55ff562b6a4ff61bcc045ea5f47ac4fd35385d8c72e9fbc33d7496481ad0fd24832ffb4e21c64c7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcodings-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
