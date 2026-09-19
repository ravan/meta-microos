SUMMARY = "Application tools in Python"
DESCRIPTION = "The apptools project includes a set of packages that Enthought has found \
useful in creating a number of applications.  They implement functionality \
that is commonly needed by many applications. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-3.0-only"

PV = "5.2.1"

RPM_NAME = "python311-apptools-5.2.1-1.2.noarch.rpm"
RPM_HASH = "f9fa5b106a8dcd0710883353aa2b252f1d6f3e4734d93a298a2a2bc3029ab8baae6c343693c719de58296d6522159b15ed36e64edbbf9bd158b39e57cab6c6bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apptools \
python3.11dist-apptools \
python311-apptools \
python3dist-apptools"

RDEPENDS:${PN} += "python-abi \
python311-configobj \
python311-traits"

inherit rpm
