SUMMARY = "GAP: a package for doing computations with quantum groups"
DESCRIPTION = "The package QuaGroup contains functionality for working with \
quantized enveloping algebras of finite-dimensional semisimple Lie \
algebras."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.4"

RPM_NAME = "gap-quagroup-1.8.4-1.8.noarch.rpm"
RPM_HASH = "91ec4bff92bfb67384040eb15b04c5734a5dfc04156963cc764d8142f86dd1d8e9d4dfb670fe29ffc1b05cd2af50881304501c5883fafa72a50ece0bd31e3b9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-quagroup"

RDEPENDS:${PN} += "gap-core"

inherit rpm
