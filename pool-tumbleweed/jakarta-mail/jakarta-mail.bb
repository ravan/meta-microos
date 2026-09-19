SUMMARY = "Jakarta Mail API"
DESCRIPTION = "Jakarta Activation lets you take advantage of standard services to: \
determine the type of an arbitrary piece of data; encapsulate access to \
it; discover the operations available on it; and instantiate the \
appropriate bean to perform the operation(s)."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.1.3"

RPM_NAME = "jakarta-mail-2.1.3-1.9.noarch.rpm"
RPM_HASH = "48e25b0064772e239683a8bb0df368fa91a7a523ff9780381a0220f11966f4e53d10dc6013e47193c4dc8afe0910d449e47e40bd20b5ac18842e9c13a48e9673"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-mail \
mvn-jakarta.mail-jakarta.mail-api \
mvn-jakarta.mail-jakarta.mail-api-pom- \
osgi-jakarta.mail-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-jakarta.activation-jakarta.activation-api"

inherit rpm
