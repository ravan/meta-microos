SUMMARY = "Javadocs for jnr-unixsocket"
DESCRIPTION = "This package contains the API documentation for jnr-unixsocket."
LICENSE = "Apache-2.0"

PV = "0.38.19"

RPM_NAME = "jnr-unixsocket-javadoc-0.38.19-2.10.noarch.rpm"
RPM_HASH = "38796d7ca2138602b2cfed4e047620202253c835882cfa6c7f90f69507e9875f230f581e423339576eed58da588c685e70da8e6ab18d3f1e0ec942e00b1b57b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-unixsocket-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
