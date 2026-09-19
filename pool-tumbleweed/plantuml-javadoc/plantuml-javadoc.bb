SUMMARY = "Javadoc for plantuml"
DESCRIPTION = "This package contains the API documentation for plantuml."
LICENSE = "GPL-3.0-or-later"

PV = "1.2025.2"

RPM_NAME = "plantuml-javadoc-1.2025.2-1.6.noarch.rpm"
RPM_HASH = "660a75a7793e35c9b4162363baa5043b7cea445af00cb4dae945c422ca4c156fe0d5e1d1230dacbbc48a99da8850009ccf4b8138c14280e5d4cbe2fd1530bc53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plantuml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
