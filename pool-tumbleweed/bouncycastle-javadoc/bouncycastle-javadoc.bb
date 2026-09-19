SUMMARY = "Javadoc for bouncycastle"
DESCRIPTION = "API documentation for the Bouncy Castle Cryptography APIs."
LICENSE = "MIT"

PV = "1.85"

RPM_NAME = "bouncycastle-javadoc-1.85-1.1.noarch.rpm"
RPM_HASH = "24dd86c5bb45b347bfa689a79664d8db583a77f2f45f8b522eca8e9b9edd1f5c3da587c3a34ee96c53a096486af40c78034fad1191cea9adabefaaaf4b98f170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bouncycastle-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
