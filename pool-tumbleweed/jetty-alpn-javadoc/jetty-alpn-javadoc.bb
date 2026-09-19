SUMMARY = "Javadoc for jetty-alpn"
DESCRIPTION = "Javadoc for jetty-alpn."
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "9.4.58"

RPM_NAME = "jetty-alpn-javadoc-9.4.58-5.1.noarch.rpm"
RPM_HASH = "f0cfcc576b3b56e679ff39de41bde69b20eccab3868c39b697dda82d3399e16d578ebd4db6acc50c88aac365828de31b1d71e705258122d3f0268473ccdcc9b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-alpn-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
