SUMMARY = "GAP: Congruence subgroups of SL(2,Z)"
DESCRIPTION = "The Congruence package provides functions to construct several types \
of canonical congruence subgroups in SL_2(Z), and also intersections \
of a finite number of such subgroups. Furthermore, it implements the \
algorithm for generating Farey symbols for congruence subgroups and \
using them to produce a system of independent generators for these \
subgroups."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.7"

RPM_NAME = "gap-congruence-1.2.7-1.6.noarch.rpm"
RPM_HASH = "36bb244ce02ed9c28ea32533ace0f5c19bf3f4d2c39ccee1eabfcc7362aec0950c7a672559a53bbb3b86d1c2c1003e3b8b2d26028729ed8a9bb3be08baef1d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-congruence"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc"

inherit rpm
