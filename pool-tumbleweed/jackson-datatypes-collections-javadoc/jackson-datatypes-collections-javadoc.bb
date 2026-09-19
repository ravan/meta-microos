SUMMARY = "Javadoc for jackson-datatypes-collections"
DESCRIPTION = "This package contains API documentation for jackson-datatypes-collections."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-datatypes-collections-javadoc-2.18.9-1.1.noarch.rpm"
RPM_HASH = "176f3ded3045a6ea68a8c90c0dc7b7394f2e6072ca7b66d535d16105dadeb6d8f4f7666d8e794ae1d621d07720277a252c919c22dd1b543d42e97678299c1d65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatypes-collections-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
