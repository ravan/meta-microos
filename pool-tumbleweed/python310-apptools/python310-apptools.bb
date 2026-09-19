SUMMARY = "Application tools in Python"
DESCRIPTION = "The apptools project includes a set of packages that Enthought has found \
useful in creating a number of applications.  They implement functionality \
that is commonly needed by many applications. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-3.0-only"

PV = "5.2.1"

RPM_NAME = "python310-apptools-5.2.1-1.2.noarch.rpm"
RPM_HASH = "08ce32f391d00ea5bd66ae042fa03cd533e5e0166d16900a1d09f181062759b0c4bcbbe7ee0e1a1c5bc58fa194e4025fccfb80c24e96da2ce8883bb9df869dfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-apptools \
python310-apptools \
python3dist-apptools"

RDEPENDS:${PN} += "python-abi \
python310-configobj \
python310-traits"

inherit rpm
