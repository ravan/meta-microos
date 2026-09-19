SUMMARY = "Javadoc for language-detector"
DESCRIPTION = "This package contains javadoc for language-detector."
LICENSE = "Apache-2.0"

PV = "0.6"

RPM_NAME = "language-detector-javadoc-0.6-3.10.noarch.rpm"
RPM_HASH = "053b7f2504b4248cca62f713af993b16bcd6589e7faeabee05d7eb9d3679c3ccc325f34de8e243e93443b10f7019c877684766cd90dfff3c76083c7e61bf3a33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "language-detector-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
