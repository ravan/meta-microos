SUMMARY = "Viewer for MathML files"
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
This pacakges contains the Swing MathViewer application."
LICENSE = "Apache-2.0 & LGPL-2.1-only"

PV = "3.1.9"

RPM_NAME = "jeuclid-mathviewer-3.1.9-4.4.noarch.rpm"
RPM_HASH = "b502f6b9922f0f6e6dd26aaaad4af18027826693dd15f9940222c9630107216bdf90f7dd3594805fe9bdc674e7f888a92c66b26e6260afe845be30227e26b6d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeuclid-mathviewer"

RDEPENDS:${PN} += "/usr/bin/bash \
hicolor-icon-theme \
jeuclid"

inherit rpm
