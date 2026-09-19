SUMMARY = "API documentation for aalto-xml"
DESCRIPTION = "API documentation for aalto-xml."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "aalto-xml-javadoc-1.4.0-1.2.noarch.rpm"
RPM_HASH = "39449415aefade6359b98ad5d6f8414135de5fc18b6494034708f738cacc22e6e8d4697f73ff140402a430a69594000ca7a4257e8abbd4ca200b237ba09a8f91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aalto-xml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
