SUMMARY = "Small java library for generating META-INF/services files"
DESCRIPTION = "This package contains small Java library which can be used \
for automatic generation of META-INF/services files."
LICENSE = "MIT"

PV = "1.9"

RPM_NAME = "metainf-services-1.9-1.21.noarch.rpm"
RPM_HASH = "7a73d7ba24429597e9a9a168aa2cda8f94ee11675e6d5350cf61b3cafb0a9145d8c392aadf3f74fe7248cc9bd7d9ce8f6950c0368d9104ef9768ae41bdf0bd77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metainf-services \
mvn-org.kohsuke.metainf-services-metainf-services \
mvn-org.kohsuke.metainf-services-metainf-services-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
