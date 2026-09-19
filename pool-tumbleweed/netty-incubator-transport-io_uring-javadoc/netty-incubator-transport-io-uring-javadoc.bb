SUMMARY = "API documentation for netty-incubator-transport-io_uring"
DESCRIPTION = "API documentation for netty-incubator-transport-io_uring."
LICENSE = "Apache-2.0"

PV = "0.0.26"

RPM_NAME = "netty-incubator-transport-io_uring-javadoc-0.0.26-1.4.noarch.rpm"
RPM_HASH = "618fa0a20133aef1d7067d0ef48bc6aa9cf8a1a33023dc61d02d958aab3cdc9b9fbddfc1499097cc3084fd060e3740e739ec72fb41673304a81ac75e4abab7e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netty-incubator-transport-io-uring-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
