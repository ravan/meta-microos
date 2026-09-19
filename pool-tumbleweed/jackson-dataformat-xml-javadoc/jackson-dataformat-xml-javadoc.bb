SUMMARY = "Javadoc for jackson-dataformat-xml"
DESCRIPTION = "This package contains API documentation for jackson-dataformat-xml."
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-dataformat-xml-javadoc-2.18.9-1.1.noarch.rpm"
RPM_HASH = "56224b09fb7e1ac95a18fea172fdd09adf610cbce431fc9cd8eaf1fab8fb6fede5b4ad20687f195ed649ddf8b1a5e8426bb5a03f0d0a7eb62197d72c0e450f9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-xml-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
