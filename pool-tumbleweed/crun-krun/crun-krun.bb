SUMMARY = "crun with libkrun support"
DESCRIPTION = "krun is a symlink to the crun binary, with libkrun as an additional dependency."
LICENSE = "GPL-2.0-or-later"

PV = "1.28"

RPM_NAME = "crun-krun-1.28-2.2.aarch64.rpm"
RPM_HASH = "f8137e3900b04321323fd28f025da1eb9f85f41472bfb0a4de032ef9ad26a682722b6ca4f8f58413120bb612c05bce0e9d2a478cc110a144d3195ef71a229a61"

RPROVIDES:${PN} += "crun-krun \
krun"

RDEPENDS:${PN} += "crun \
libkrun1"

inherit rpm
