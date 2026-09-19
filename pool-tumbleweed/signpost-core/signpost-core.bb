SUMMARY = "A simple, light-weight, and modular OAuth client library for the Java platform"
DESCRIPTION = "Signpost is the easy and intuitive solution for signing HTTP messages on the \
Java platform in conformance with the OAuth Core 1.0a standard. \
Signpost follows a modular and flexible design, allowing you to combine it with \
different HTTP messaging layers"
LICENSE = "Apache-2.0"

PV = "1.2.1.2"

RPM_NAME = "signpost-core-1.2.1.2-3.20.noarch.rpm"
RPM_HASH = "c4f8ec47be41b7f4c110116546f5681a190da0fd5486ff13388ea0ab1cea04d2e6d9f5648f5b55123eb73d1c962e813ff0fa3b8ec0c3d247557e61b3a558bf93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-oauth.signpost-signpost-core \
mvn-oauth.signpost-signpost-core-pom- \
signpost-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-codec-commons-codec"

inherit rpm
