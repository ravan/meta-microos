SUMMARY = "Javadoc for reflections"
DESCRIPTION = "This package contains the API documentation for reflections."
LICENSE = "WTFPL"

PV = "0.10.2"

RPM_NAME = "reflections-javadoc-0.10.2-3.1.noarch.rpm"
RPM_HASH = "eaeccd105ce3c21624003ce87e245eac3c0c47b0ae2570a2e0be38cecd53ac2f6dd4a72117b6572850b84f7d24b137cabff58533047822a8c3dba9149c85b35d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "reflections-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
