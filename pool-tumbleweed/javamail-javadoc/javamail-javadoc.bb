SUMMARY = "Javadoc for javamail"
DESCRIPTION = "Javadoc for javamail."
LICENSE = "CDDL-1.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "1.6.2"

RPM_NAME = "javamail-javadoc-1.6.2-3.6.noarch.rpm"
RPM_HASH = "95910a9ff5de9be9c7cd40babbb23f0ed188f7324ff638a14cb25d1ce155aa4881f4c3df1f6f42c3afde6d537d707629a2ede031ccfd2e5ca8ed4651aef0ad6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javamail-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
