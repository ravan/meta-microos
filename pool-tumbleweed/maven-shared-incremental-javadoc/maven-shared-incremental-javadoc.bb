SUMMARY = "API documentation for maven-shared-incremental"
DESCRIPTION = "This package provides API documentation for maven-shared-incremental."
LICENSE = "Apache-2.0"

PV = "1.1"

RPM_NAME = "maven-shared-incremental-javadoc-1.1-4.8.noarch.rpm"
RPM_HASH = "4b48b0c951f69b60aaa2eb5b025d037553b4d3646a6e32b09e6a78b6339d8c9a039875caee587aaf3495efabd93306bd4ca42c0700a0c63f2cd9fe6535f19b3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-incremental-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
