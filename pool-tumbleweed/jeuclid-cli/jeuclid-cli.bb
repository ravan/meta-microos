SUMMARY = "Command line interface for JEuclid"
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
This pacakges provides a command line interface for JEuclid."
LICENSE = "Apache-2.0 & LGPL-2.1-only"

PV = "3.1.9"

RPM_NAME = "jeuclid-cli-3.1.9-4.4.noarch.rpm"
RPM_HASH = "719f6cb3192dcf256b3f66311edb327cdd19e86b425ddd5f8cd84ffcee56bea77efad354b9ae6e137adbe39e619d5aaf70926d881bf6de262fbeb7f04ce02ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeuclid-cli"

RDEPENDS:${PN} += "/usr/bin/bash \
apache-commons-cli \
apache-commons-io \
apache-commons-lang3 \
jeuclid"

inherit rpm
