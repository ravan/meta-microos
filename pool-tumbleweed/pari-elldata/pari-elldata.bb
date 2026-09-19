SUMMARY = "Elliptic Curve Data for the PARI CAS"
DESCRIPTION = "PARI/GP version of J. E. Cremona's Elliptic Curve Data, needed by \
the PARI functions 'ellsearch' and 'ellidentify'."
LICENSE = "GPL-2.0-or-later"

PV = "20210301"

RPM_NAME = "pari-elldata-20210301-1.14.noarch.rpm"
RPM_HASH = "421f613875536bfff53bd1fac2b9ec3d5a87a6bf3d59c9eb44d023a017827f10ad063422cd4a709727c5f882733a8ea78db1ed85f2b317a394d0fa7a5b15d783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pari-elldata"

RDEPENDS:${PN} += ""

inherit rpm
