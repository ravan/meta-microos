SUMMARY = "API documentation for byte-buddy"
DESCRIPTION = "API documentation for byte-buddy."
LICENSE = "Apache-2.0"

PV = "1.18.8"

RPM_NAME = "byte-buddy-javadoc-1.18.8-1.2.noarch.rpm"
RPM_HASH = "6f6211f6cf16a7da19e572a10bde978983b5aef4f8a55f5f0031b5587bc168c1a9bb880983970a40feeaf53d7b727fcd2056f4690713702002650b8fdb398d35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "byte-buddy-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
