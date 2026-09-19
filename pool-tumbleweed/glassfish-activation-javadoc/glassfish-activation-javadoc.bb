SUMMARY = "Javadoc for glassfish-activation"
DESCRIPTION = "Javadoc for glassfish-activation."
LICENSE = "(BSD-3-Clause & GPL-2.0-only-with-Classpath-exception-2.0) | CDDL-1.1"

PV = "1.2.0"

RPM_NAME = "glassfish-activation-javadoc-1.2.0-6.8.noarch.rpm"
RPM_HASH = "8883bb0ed39c0c58a045cc29988cccbaa7296d44ecdae8585ad9b4ed3cbd0f1b85344bdc6885062fdccaddcfb06e96c3566dc7f622d28601c1315057d87acea7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-activation-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
