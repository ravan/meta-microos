SUMMARY = "API documentation for protobuf-maven-plugin"
DESCRIPTION = "This package provides API documentation for protobuf-maven-plugin."
LICENSE = "Apache-2.0"

PV = "0.6.1"

RPM_NAME = "protobuf-maven-plugin-javadoc-0.6.1-1.6.noarch.rpm"
RPM_HASH = "a845f40254dc54b8ff383033c75d72b8792d33a8c079b3e0249407301e65c21728d5296ee3e3301bc61b86dab8b25654b0c8b2234a0330f3ac10471f7c793aee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "protobuf-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
