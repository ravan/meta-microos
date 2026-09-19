SUMMARY = "Javadoc for plexus-build-api0"
DESCRIPTION = "API documentation for plexus-build-api0."
LICENSE = "Apache-2.0"

PV = "0.0.8"

RPM_NAME = "plexus-build-api0-javadoc-0.0.8-2.8.noarch.rpm"
RPM_HASH = "f5e88757aeb2656bc562514745b41cdc6a6712b24e886e9c2b6145a3ef780688f45a022a8aa3e4c35812cd17f1602c3c573c0a2d1f5f9a1bd370a5187b76b8df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-build-api0-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
