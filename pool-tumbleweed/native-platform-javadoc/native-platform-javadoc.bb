SUMMARY = "Javadoc for native-platform"
DESCRIPTION = "This package contains javadoc for native-platform."
LICENSE = "Apache-2.0"

PV = "0.14"

RPM_NAME = "native-platform-javadoc-0.14-5.2.noarch.rpm"
RPM_HASH = "5f9d8991aa49d3e54057d943eb36c67783d89dcdcd59905dc3b4ebdfd80e70337fe05fce3a3723f61b84452ea47e620d9bf7e03585b24687ada5ebe9bc9824b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "native-platform-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
