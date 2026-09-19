SUMMARY = "JEuclid plug-in for FOP"
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
This pacakges contains a JEuclid plug-in for \
FOP (Formatting Objects Processor)."
LICENSE = "Apache-2.0 & LGPL-2.1-only"

PV = "3.1.9"

RPM_NAME = "jeuclid-fop-3.1.9-4.4.noarch.rpm"
RPM_HASH = "229be510550bb5d1b96c4e20fbe3b3673da4f2522ce086036f7660601e923c174fbd067588ea803c807fdca6ba7e2e1c95db4ac8913286bff48428fd5c784498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeuclid-fop"

RDEPENDS:${PN} += "jeuclid \
xmlgraphics-fop"

inherit rpm
