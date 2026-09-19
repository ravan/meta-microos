SUMMARY = "API documentation for stax2-api"
DESCRIPTION = "This package contains the API documentation for stax2-api."
LICENSE = "BSD-2-Clause"

PV = "4.3.0"

RPM_NAME = "stax2-api-javadoc-4.3.0-1.2.noarch.rpm"
RPM_HASH = "9444d409de8fdb004d4c5c4677bada01c89a41b39e508489f8c314a65633a853d9b876e9f5fc2440cd5a55a1c8ab1d9ed9210d92f4b9d3326dad4bcc33d196a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "stax2-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
