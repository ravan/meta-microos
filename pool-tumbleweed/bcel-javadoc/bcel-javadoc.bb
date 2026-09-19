SUMMARY = "Javadoc for bcel"
DESCRIPTION = "This package contains the API documentation for bcel."
LICENSE = "Apache-2.0"

PV = "6.10.0"

RPM_NAME = "bcel-javadoc-6.10.0-1.9.noarch.rpm"
RPM_HASH = "d8a553748f583a7501881f5b4c1425ef999e3bc775dc0e1d4f7579e9638e562fde00cf6da875cbc9a500a19844088272fb177ecddfc2fca05b999c3a93f36ece"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bcel-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
