SUMMARY = "API documentation for Sisu"
DESCRIPTION = "This package contains API documentation for Sisu."
LICENSE = "BSD-3-Clause & EPL-1.0 & EPL-2.0"

PV = "1.1.0"

RPM_NAME = "sisu-javadoc-1.1.0-2.1.noarch.rpm"
RPM_HASH = "8cfff854e5809ec7f445d94ec20e66c740db421993d5c55c12eb7a41e8d6e6a94df53b0806d32b531a3579674f7b7b0b33acb3f5a972afc6c52ab806b7700883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sisu-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
