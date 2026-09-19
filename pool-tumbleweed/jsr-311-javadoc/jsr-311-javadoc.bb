SUMMARY = "Javadoc for jsr-311"
DESCRIPTION = "This package contains javadoc for jsr-311."
LICENSE = "CDDL-1.0"

PV = "1.1.1"

RPM_NAME = "jsr-311-javadoc-1.1.1-4.10.noarch.rpm"
RPM_HASH = "867a4eea18890f9fcdc05ab4b2c692a8bdff658fe09ab31a8645d61e1b45b4ef3523d04511702c119b9eb7e7a84a9411ba0471d9f5b3eb0dc615604cda3ce6a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsr-311-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
