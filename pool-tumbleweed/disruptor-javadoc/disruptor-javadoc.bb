SUMMARY = "Javadoc for disruptor"
DESCRIPTION = "This package contains javadoc for disruptor."
LICENSE = "Apache-2.0"

PV = "3.4.4"

RPM_NAME = "disruptor-javadoc-3.4.4-2.10.noarch.rpm"
RPM_HASH = "41a5add4b0fe1abb974fe6c836691e214e46d0ca5e6d359a55a3154c4293d2ab8afe1ba93a064d0e164c3b9f4e26a898b447690861779e5c79ba680a3d67c4eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "disruptor-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
