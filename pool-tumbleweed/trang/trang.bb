SUMMARY = "Multi-format schema converter based on RELAX NG"
DESCRIPTION = "Trang converts between different schema languages for XML.  It supports the \
following languages: RELAX NG (both XML and compact syntax), XML 1.0 DTDs, W3C \
XML Schema.  A schema written in any of the supported schema languages can be \
converted into any of the other supported schema languages, except that W3C XML \
Schema is supported for output only, not for input."
LICENSE = "BSD-3-Clause"

PV = "20220510"

RPM_NAME = "trang-20220510-5.10.noarch.rpm"
RPM_HASH = "f4be132bc0edc102bd90cb53c562109060c67bef8bb075f1347982d5974d5b7ee0d067a2d1ce37406fbbc65899e1479b295e56d38bf1a2cc3876379edd710b37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thaiopensource-trang \
mvn-org.relaxng-trang \
mvn-org.relaxng-trang-pom- \
trang"

RDEPENDS:${PN} += "/usr/bin/bash \
java-headless \
javapackages-filesystem \
jpackage-utils \
mvn-com.github.relaxng-relaxngDatatype \
mvn-xerces-xercesImpl \
mvn-xml-resolver-xml-resolver"

inherit rpm
