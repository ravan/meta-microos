SUMMARY = "MathML rendering solution"
DESCRIPTION = "JEuclid is a complete MathML rendering solution, consisting of: \
 \
    A MathViewer application \
    Command line converters from MathML to other formats \
    An ant task for automated conversion \
    Display components for AWT, Swing, and SWT \
 \
JEuclid features: \
 \
    Almost complete support for presentation MathML 2.0 \
    Basic support for content MathML 2.0 \
    Initial support for the upcoming MathML 3.0 \
 \
This pacakges contains the core module containing basic JEuclid \
rendering and document handling classes."
LICENSE = "Apache-2.0 & LGPL-2.1-only"

PV = "3.1.9"

RPM_NAME = "jeuclid-3.1.9-4.4.noarch.rpm"
RPM_HASH = "c5a80c0fe226cb336a70f3912b157c3348b428c2dbf1e0b6b76449f0b528bc5d7621f88426284891faa1352fb80d2556bbd28c08bfba4e335c5b796a2323a04b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeuclid"

RDEPENDS:${PN} += "/usr/bin/sh \
apache-commons-logging \
batik \
java \
javapackages-tools \
jcip-annotations \
xmlgraphics-commons"

inherit rpm
