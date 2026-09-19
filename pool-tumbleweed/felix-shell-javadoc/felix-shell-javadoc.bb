SUMMARY = "API documentation for felix-shell"
DESCRIPTION = "This package contains API documentation for felix-shell."
LICENSE = "Apache-2.0"

PV = "1.4.3"

RPM_NAME = "felix-shell-javadoc-1.4.3-5.8.noarch.rpm"
RPM_HASH = "e68d19088c2762b08e7e8fc7d85e0d50a1cd103b20d8d01e2b4f10cc9fd458d1bbddf13c965c24025fe011c0f1d99d830c5d32ee36e9c66c68f34229337f1147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "felix-shell-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
