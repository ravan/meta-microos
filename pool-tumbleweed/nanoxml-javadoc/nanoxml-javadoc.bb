SUMMARY = "Javadoc for nanoxml"
DESCRIPTION = "Java documentation for nanoxml."
LICENSE = "Zlib"

PV = "2.2.3"

RPM_NAME = "nanoxml-javadoc-2.2.3-6.10.noarch.rpm"
RPM_HASH = "360d0eea4e44a6691ae90ba5d99ce3488a4d34b265a4e0284523dcd9071825013750611232634a9eec6797bdd121046d8be92d805fce89b9f8169a29e7af12e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanoxml-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
