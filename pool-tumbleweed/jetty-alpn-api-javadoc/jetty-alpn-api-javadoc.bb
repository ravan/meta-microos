SUMMARY = "API documentation for jetty-alpn-api"
DESCRIPTION = "This package provides API documentation for jetty-alpn-api."
LICENSE = "Apache-2.0 & EPL-1.0"

PV = "1.1.3.v20160715"

RPM_NAME = "jetty-alpn-api-javadoc-1.1.3.v20160715-1.9.noarch.rpm"
RPM_HASH = "bfb9987da080b6c94b954dd9f1d33b9c3eb8e30b1dbafd202a9ef3ac4ccae51f8f38c6cefcffe57ccb2bdc5e374a842b2f36a0b209cd55480330d407a32bd20d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-alpn-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
