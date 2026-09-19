SUMMARY = "Javadoc for clojure-maven-plugin"
DESCRIPTION = "This package contains the API documentation for clojure-maven-plugin."
LICENSE = "EPL-1.0"

PV = "1.9.3"

RPM_NAME = "clojure-maven-plugin-javadoc-1.9.3-1.1.noarch.rpm"
RPM_HASH = "28f10e442919aeae0464699a16b41310263d58940f96d0cc7083dd26b761c73e4887055335467f7340d9e18b66fdc66c14fd83ce787ef55440593b94d98673f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "clojure-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
