SUMMARY = "Javadoc for mariadb-java-client"
DESCRIPTION = "This package contains the API documentation for mariadb-java-client."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "3.5.0"

RPM_NAME = "mariadb-java-client-javadoc-3.5.0-2.5.noarch.rpm"
RPM_HASH = "05b17816ebd41af45c095ac36bf430d080a299c7bc5c8223830a8bfaccfb6b8f27cc9390a7291338352139b96e24b9d1ff11d50284abfc7e51df6ceaf3d726e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mariadb-java-client-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
