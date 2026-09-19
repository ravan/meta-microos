SUMMARY = "GAP data library of semigroups of small size"
DESCRIPTION = "The 'Smallsemi' package is a data library of semigroups of small \
size. It provides all semigroups with at most 8 elements as well as \
various information about these objects. The reason that semigroups \
of higher orders are not included is the huge number of such objects. \
(The number of semigroups of size 10 is not even known at the time of \
writing.)"
LICENSE = "GPL-3.0-or-later"

PV = "0.7.2"

RPM_NAME = "gap-smallsemi-0.7.2-1.5.noarch.rpm"
RPM_HASH = "42f7d703aabce9971012bfbdf2b50991d43b4c70ddc5f128405b297a7447a9686b9d9f55f8a755204f4885a1ba65210891abd2a251081b599ddaea44f333ac24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-smallsemi"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
gap-core \
gzip"

inherit rpm
