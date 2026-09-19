SUMMARY = "Data files for the 'nflist' program from PARI"
DESCRIPTION = "This package contains fields of small discriminant (currently needed \
by the single Galois groups A5 and A5(6)) or to list regular \
extensions of Q(T) in degree 7 to 15, using `nflist` from the PARI \
CAS."
LICENSE = "GPL-2.0-or-later"

PV = "20220729"

RPM_NAME = "pari-nflistdata-20220729-1.10.noarch.rpm"
RPM_HASH = "6ef1b9c45d5df53f8e4a9a1f31c1637cd1fbf6b179d114cae12e30a8b6e5afda74aaa29e60dc043a9e440a7ead7fa3bbefcac5e8fd3327e9325e39b1365bb50c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pari-nflistdata"

RDEPENDS:${PN} += ""

inherit rpm
