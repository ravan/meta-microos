SUMMARY = "API documentation for xmvn-connector"
DESCRIPTION = "This package provides API documentation for xmvn-connector."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "xmvn-connector-javadoc-4.3.0-8.1.noarch.rpm"
RPM_HASH = "49b33da5077228b32de248012d31775c7b922bd7f67a29591a92dd162783bb4669ce5aea522c357ed92400c84f3f56f56acf2a737d1f4d8d3a0ed02060184bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-connector-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
