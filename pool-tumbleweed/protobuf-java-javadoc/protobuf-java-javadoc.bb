SUMMARY = "Javadoc for protobuf-java"
DESCRIPTION = "This package contains the API documentation for protobuf-java."
LICENSE = "BSD-3-Clause"

PV = "36.1"

RPM_NAME = "protobuf-java-javadoc-36.1-1.1.noarch.rpm"
RPM_HASH = "8fa31fede0a27e6f48f55f4636950e331370b721799d757b091a6e1c828dda551a368097648dd0784945692265eb11d5c6e361f88be55adee6a9cef7fa2c7d89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "protobuf-java-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
