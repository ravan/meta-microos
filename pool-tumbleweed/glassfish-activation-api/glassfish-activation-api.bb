SUMMARY = "JavaBeans Activation Framework API jar"
DESCRIPTION = "The JavaBeans Activation Framework (JAF) is a standard extension to the \
Java platform that lets you take advantage of standard services to: \
determine the type of an arbitrary piece of data; encapsulate access to it; \
discover the operations available on it; and instantiate the appropriate \
bean to perform the operation(s). \
 \
This package contains a Java library with only the APIs"
LICENSE = "(BSD-3-Clause & GPL-2.0-only-with-Classpath-exception-2.0) | CDDL-1.1"

PV = "1.2.0"

RPM_NAME = "glassfish-activation-api-1.2.0-6.8.noarch.rpm"
RPM_HASH = "cf022c3c9a34859c96ac0bd7fce167f839ed21770f5bb8cbf7ed6faebf4344047328ab58fa8c107edf844a2f6d1d70461ef9f653dde808f8dd6b26715c39e206"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-activation-api \
gnu-jaf \
mvn-javax.activation-activation \
mvn-javax.activation-activation-pom- \
mvn-javax.activation-javax.activation-api \
mvn-javax.activation-javax.activation-api-pom- \
osgi-javax.activation-api"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem"

inherit rpm
