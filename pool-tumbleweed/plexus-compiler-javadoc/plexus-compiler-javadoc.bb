SUMMARY = "Javadoc for plexus-compiler"
DESCRIPTION = "API documentation for plexus-compiler."
LICENSE = "Apache-1.1 & Apache-2.0 & MIT"

PV = "2.16.2"

RPM_NAME = "plexus-compiler-javadoc-2.16.2-1.3.noarch.rpm"
RPM_HASH = "42252366af60f96960eb72c7e1a03935bc9f4ca8f7a05778f59891cf855aa31d4e296c3a76b95fd54a0fdc5bb69804e70a8c0a6b09381569a2a5848f397d9152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-compiler-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
