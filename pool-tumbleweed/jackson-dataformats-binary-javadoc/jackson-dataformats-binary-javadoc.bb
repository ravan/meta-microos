SUMMARY = "Javadoc for jackson-dataformats-binary"
DESCRIPTION = "This package contains API documentation for jackson-dataformats-binary."
LICENSE = "Apache-2.0 & BSD-3-Clause"

PV = "2.18.9"

RPM_NAME = "jackson-dataformats-binary-javadoc-2.18.9-1.1.noarch.rpm"
RPM_HASH = "faf99a22139e8298265b07672d4d83fc86aaabc329f95c8c687880d4aea559358321ff93111f963e800161770b5faf8f15286068639492d10e5d983ee91ef5da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformats-binary-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
