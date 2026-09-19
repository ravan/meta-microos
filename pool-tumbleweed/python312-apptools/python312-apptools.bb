SUMMARY = "Application tools in Python"
DESCRIPTION = "The apptools project includes a set of packages that Enthought has found \
useful in creating a number of applications.  They implement functionality \
that is commonly needed by many applications. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-3.0-only"

PV = "5.2.1"

RPM_NAME = "python312-apptools-5.2.1-1.2.noarch.rpm"
RPM_HASH = "62b8841c5ec67b9e997161447e349d0d8f40f557021a288974dddcfa443f4cb609cc80d0f3c68e1d22c5066d214c8eca8ec9cea57e1ef299ee5130a8167fd345"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-apptools \
python312-apptools \
python3dist-apptools"

RDEPENDS:${PN} += "python-abi \
python312-configobj \
python312-traits"

inherit rpm
