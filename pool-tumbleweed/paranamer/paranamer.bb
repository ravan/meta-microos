SUMMARY = "Java library for accessing non-private method's parameter names at run-time"
DESCRIPTION = "Paranamer is a Java library that allows the parameter names of non-private \
methods and constructors to be accessed at run-time. Most compilers discard \
this information; traditional Reflection on JDK <= 7 would show something like \
doSomething(mypackage.Person ???) instead of doSomething(mypackage.Person toMe). \
The Paranamer library fills this gap for these JDK versions."
LICENSE = "BSD-3-Clause"

PV = "2.8"

RPM_NAME = "paranamer-2.8-4.10.noarch.rpm"
RPM_HASH = "1266342d343bfa15d346d97c245e914f4190644d5f2553fa4d771b0e0a80572673bdfa81fe5b5689415923ce19f8e5bf23f787bf54428f30420fe1480801bfe0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.paranamer-paranamer \
mvn-com.thoughtworks.paranamer-paranamer-pom- \
osgi-com.thoughtworks.paranamer \
paranamer"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
