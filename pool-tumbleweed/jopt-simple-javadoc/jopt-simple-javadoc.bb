SUMMARY = "Javadoc for jopt-simple"
DESCRIPTION = "This package contains the API documentation for jopt-simple."
LICENSE = "MIT"

PV = "5.0.4"

RPM_NAME = "jopt-simple-javadoc-5.0.4-3.10.noarch.rpm"
RPM_HASH = "1d8b579e86205ea5170ab1272a87e5c67a3eac02ad2496e16f47d15ab0bd0acdf14af4ebed0f75fdb52d7f375cb5d2087e93ea14506e79078e2b36dcfe8d16a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jopt-simple-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
