SUMMARY = "API documentation for rabbitmq-java-client"
DESCRIPTION = "API documentation for rabbitmq-java-client."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & MPL-2.0"

PV = "5.20.0"

RPM_NAME = "rabbitmq-java-client-javadoc-5.20.0-2.7.noarch.rpm"
RPM_HASH = "bc4152b520142b365cb64dba9cc151c05f027448ffce142224d31ee9b0458cfc66fa6448880287ee71fc43dc01fdef55899b0d5d33fb6139170eae11a9bb0ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rabbitmq-java-client-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
