SUMMARY = "Salted Challenge Response Authentication Mechanism - Java Implementation"
DESCRIPTION = "This is a Java implementation of SCRAM (Salted Challenge Response \
Authentication Mechanism) which is part of the family of Simple \
Authentication and Security Layer (SASL, RFC 4422) authentication \
mechanisms. It is described as part of RFC 5802 and RFC7677."
LICENSE = "BSD-2-Clause"

PV = "3.2"

RPM_NAME = "ongres-scram-3.2-7.3.noarch.rpm"
RPM_HASH = "f67238f4d3861bd837b94fdc425c5a0077398e62af0ebc71def09ba55395c8ee865fd44587ec1e27934edaafd62ddf6e24c79e0bd9fffe7aa7b7d642a7381b01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.ongres.scram-scram-common \
mvn-com.ongres.scram-scram-common-pom- \
ongres-scram"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.ongres.stringprep-saslprep \
mvn-com.ongres.stringprep-stringprep"

inherit rpm
