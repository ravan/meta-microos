SUMMARY = "Javadoc for jackson-dataformats-text"
DESCRIPTION = "This package contains API documentation for jackson-dataformats-text."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-dataformats-text-javadoc-2.18.9-1.1.noarch.rpm"
RPM_HASH = "4f565b5c008ccb1faa64fa4290a7745a5b6c5127dd9d6671d12fbf50836a45beb1a20bbeeb1be48207253adc387ff5fec078ab351e1287087b09842a9fae829c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-text-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
