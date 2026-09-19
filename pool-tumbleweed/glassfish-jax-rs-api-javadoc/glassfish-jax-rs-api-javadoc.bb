SUMMARY = "Javadoc for glassfish-jax-rs-api"
DESCRIPTION = "This package contains API documentation for glassfish-jax-rs-api."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.1.6"

RPM_NAME = "glassfish-jax-rs-api-javadoc-2.1.6-2.10.noarch.rpm"
RPM_HASH = "75630d42c5a430d2121b655225b4649c546e1d7d8de28a40115d87a575b665bb5e5c483803c17c2ae33bf4cab3160e0db58b4328afe7672a70f79b059e4cf198"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jax-rs-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
