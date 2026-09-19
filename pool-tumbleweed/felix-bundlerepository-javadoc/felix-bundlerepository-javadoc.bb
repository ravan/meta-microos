SUMMARY = "API documentation for felix-bundlerepository"
DESCRIPTION = "This package contains the API documentation for felix-bundlerepository."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.10"

RPM_NAME = "felix-bundlerepository-javadoc-2.0.10-2.7.noarch.rpm"
RPM_HASH = "1b862127f1fad1e46c317f7ff96a08b88449feafc0abd24cbb392f84e511793724c5a71b3b470ade0f2af226299a65c7e0814ad1c467031b20fb0294e13d552e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-bundlerepository-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
