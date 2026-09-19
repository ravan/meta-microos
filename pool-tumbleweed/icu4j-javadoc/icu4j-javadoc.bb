SUMMARY = "Javadoc for icu4j"
DESCRIPTION = "API documentation for icu4j."
LICENSE = "BSD-3-Clause & MIT & Unicode & LicenseRef-SUSE-Public-Domain"

PV = "73.1"

RPM_NAME = "icu4j-javadoc-73.1-5.3.noarch.rpm"
RPM_HASH = "fafaaf4f2605cdd2910d6ebe1cb4f1aafe0edfd2aef142712b53b01281342308b71db32d51ddb453098103fb4be8548f0e8a940194fcf7e385f236fab3eb696c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icu4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
