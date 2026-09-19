SUMMARY = "Application tools in Python"
DESCRIPTION = "The apptools project includes a set of packages that Enthought has found \
useful in creating a number of applications.  They implement functionality \
that is commonly needed by many applications. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-3.0-only"

PV = "5.3.1"

RPM_NAME = "python313-apptools-5.3.1-1.4.noarch.rpm"
RPM_HASH = "b8eb80dbd5d916d08341e0b6f4357fded7a34c0441c40e9c0241ba51b89d2af2ef8ac4cadbd515acf0a0f1240956921d25dbfbec396e0ce37737b0b482b51798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apptools \
python3.13dist-apptools \
python313-apptools \
python3dist-apptools"

RDEPENDS:${PN} += "python-abi \
python313-configobj \
python313-traits"

inherit rpm
