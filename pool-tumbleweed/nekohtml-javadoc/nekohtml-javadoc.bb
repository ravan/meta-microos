SUMMARY = "Javadoc for nekohtml"
DESCRIPTION = "Javadoc for nekohtml."
LICENSE = "Apache-2.0"

PV = "1.9.22.noko2"

RPM_NAME = "nekohtml-javadoc-1.9.22.noko2-2.12.noarch.rpm"
RPM_HASH = "9eaf04341d4136151b915ac5c4326b1fa7ec90c6fe7f538f6063d62b4afab5919703e2e890c546581dffa543335387255533e840167161bca208400abb715878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nekohtml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
