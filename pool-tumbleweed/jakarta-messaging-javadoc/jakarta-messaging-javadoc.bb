SUMMARY = "Javadoc for jakarta-messaging"
DESCRIPTION = "This package contains the API documentation for jakarta-messaging."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.1.0"

RPM_NAME = "jakarta-messaging-javadoc-3.1.0-2.3.noarch.rpm"
RPM_HASH = "fd9f421d44efe756962e6d5572466fe4e4886610a95b44ab6704349399c5a11d197afa33253e7104046d92a93b354288f2f7456c03c104ce7124db3dec5db6ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-messaging-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
