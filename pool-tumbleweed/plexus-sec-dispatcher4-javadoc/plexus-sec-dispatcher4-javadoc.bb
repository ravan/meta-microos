SUMMARY = "Javadoc for plexus-sec-dispatcher4"
DESCRIPTION = "API documentation for plexus-sec-dispatcher4."
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "plexus-sec-dispatcher4-javadoc-4.1.0-2.1.noarch.rpm"
RPM_HASH = "f171011a4504acad019d628c52b7af16babd8ffaddfbbe2c5df5b2306abcc8c942e58b459113915b1b002ec68108bb72643178c405381b604375f577e5a2fee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-sec-dispatcher4-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
