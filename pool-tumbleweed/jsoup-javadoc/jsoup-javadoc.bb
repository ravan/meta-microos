SUMMARY = "Javadoc for jsoup"
DESCRIPTION = "API documentation for jsoup."
LICENSE = "MIT"

PV = "1.23.2"

RPM_NAME = "jsoup-javadoc-1.23.2-1.1.noarch.rpm"
RPM_HASH = "c2d45ce7c12f118008ff005ce243a8d70468bb995cdbf6e680d14e9d429063e492c063667def5e1a349516edca34d577269632dff9a69a54e7a17affde66b654"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsoup-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
