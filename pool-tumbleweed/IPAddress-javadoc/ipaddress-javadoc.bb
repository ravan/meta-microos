SUMMARY = "API documentation for IPAddress"
DESCRIPTION = "This package provides API documentation for xbean."
LICENSE = "Apache-2.0"

PV = "5.5.1"

RPM_NAME = "IPAddress-javadoc-5.5.1-2.7.noarch.rpm"
RPM_HASH = "07d7c12328c2b5a80378322222d7f404bd9a9d327886ba588b06eeceba231511a9717d32c8e610f166f2d8c0a1d55915d3ee1f5ddbef52e2d961dbdf253d2988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAddress-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
