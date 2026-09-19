SUMMARY = "Javadoc for cdi-api"
DESCRIPTION = "This package contains the API documentation for cdi-api."
LICENSE = "Apache-2.0"

PV = "2.0.2"

RPM_NAME = "cdi-api-javadoc-2.0.2-5.10.noarch.rpm"
RPM_HASH = "3287c5a17875e24eb3b57747005bb8a9678fe50edea9303e97c212e22e9ea45d57b31550a9ae4f73dd1a92a4856a5a7f11f506583f939fede36abea08226e73b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cdi-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
