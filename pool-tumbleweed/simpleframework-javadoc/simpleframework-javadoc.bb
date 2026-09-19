SUMMARY = "API documentation for simpleframework"
DESCRIPTION = "API documentation for simpleframework."
LICENSE = "Apache-2.0"

PV = "6.0.1"

RPM_NAME = "simpleframework-javadoc-6.0.1-2.4.noarch.rpm"
RPM_HASH = "2ce5798916bb7c89db9824d568536f4b6a61798bf22385b99398ae5d5da8d8cabd376fe29ee01e99610772be3703bceef7c9dfe2d7dab8550568fa9de65f4aed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "simpleframework-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
