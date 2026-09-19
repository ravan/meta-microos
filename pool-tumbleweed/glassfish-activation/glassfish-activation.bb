SUMMARY = "JavaBeans Activation Framework"
DESCRIPTION = "The JavaBeans Activation Framework (JAF) is a standard extension to the \
Java platform that lets you take advantage of standard services to: \
determine the type of an arbitrary piece of data; encapsulate access to it; \
discover the operations available on it; and instantiate the appropriate \
bean to perform the operation(s)."
LICENSE = "(BSD-3-Clause & GPL-2.0-only-with-Classpath-exception-2.0) | CDDL-1.1"

PV = "1.2.0"

RPM_NAME = "glassfish-activation-1.2.0-6.8.noarch.rpm"
RPM_HASH = "965ffa24393a8123f1fb01064171385fa5faebf46e0cc9cbc750d4ac030718e7f69f64aa46be9fad8959fb42c0da84cad0b1193a7dc8b0213f082b4ea2e8ba75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-activation \
mvn-com.sun.activation-javax.activation \
mvn-com.sun.activation-javax.activation-pom- \
osgi-com.sun.activation.javax.activation"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
