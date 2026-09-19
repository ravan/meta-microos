SUMMARY = "Javadocs for joda-time"
DESCRIPTION = "This package contains the API documentation for joda-time."
LICENSE = "Apache-2.0"

PV = "2.12.7"

RPM_NAME = "joda-time-javadoc-2.12.7-1.8.noarch.rpm"
RPM_HASH = "faa9bb25ec3bcfd9ce18af5b5583958e9c193f5ac6aaec99dea5067d4d579ff43ef6758d9a93a5effba2a983ef5041854dfcfe079d38e2d7100cae34755fd76e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "joda-time-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
