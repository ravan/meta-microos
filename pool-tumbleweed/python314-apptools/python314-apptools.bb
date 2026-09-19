SUMMARY = "Application tools in Python"
DESCRIPTION = "The apptools project includes a set of packages that Enthought has found \
useful in creating a number of applications.  They implement functionality \
that is commonly needed by many applications. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-3.0-only"

PV = "5.3.1"

RPM_NAME = "python314-apptools-5.3.1-1.4.noarch.rpm"
RPM_HASH = "6693134c4c2633250ea15d8589d432cd6120adb3f30dbd203b532d90fafd9009b27db7740c9197ee491ee17554153968c5e93ce772a7592d65c97f6e247571f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-apptools \
python314-apptools \
python3dist-apptools"

RDEPENDS:${PN} += "python-abi \
python314-configobj \
python314-traits"

inherit rpm
