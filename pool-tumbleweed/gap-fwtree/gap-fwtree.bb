SUMMARY = "GAP: Computation of trees related to some pro-p-groups of finite width"
DESCRIPTION = "The fwtree package contains some code related to the computation \
of trees corresponding to some groups of finite rank, width and \
obliquity."
LICENSE = "GPL-2.0-or-later"

PV = "1.3"

RPM_NAME = "gap-fwtree-1.3-1.9.aarch64.rpm"
RPM_HASH = "7b9409b51d1e42b2a198e01f631b838ccc5eb4d8ea9f8732cfa911da74ced391f45bbbc7b53d6f45631bc921092f8c2bd96be62d3337ccd61d6f0d3d0f3977f8"

RPROVIDES:${PN} += "gap-fwtree"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-anupq \
gap-autpgrp \
gap-core \
gap-polycyclic"

inherit rpm
