SUMMARY = "Javadoc for json-java"
DESCRIPTION = "This package contains the API documentation for json-java."
LICENSE = "JSON"

PV = "20240303"

RPM_NAME = "json-java-javadoc-20240303-1.5.noarch.rpm"
RPM_HASH = "fe1517f9530fcf9f9442982bfbc146b67f7d72490d534c6c9e28e3bab1f22ad246213f1c480905ed52eb6e1701e050d7798e65356a0a7a497cc05d064dc7dcb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
