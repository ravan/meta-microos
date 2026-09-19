SUMMARY = "API documentation for methanol"
DESCRIPTION = "API documentation for methanol."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "methanol-javadoc-1.9.0-1.4.noarch.rpm"
RPM_HASH = "28f6199c8bbc01b18b23ff3df5fc1d7188bfb69a77d12ddb69178d9f5e7f11b9b7bcbfb003612d96489301d2675f060e9a4a758119fd0eb5963a340898b10ab8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "methanol-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
