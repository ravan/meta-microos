SUMMARY = "Development files for Genius, a general purpose calculator"
DESCRIPTION = "Genius is a general purpose calculator program similar in some aspects \
to BC, Matlab, Maple or Mathematica. It is useful both as a simple \
calculator and as a research or educational tool. The syntax \
mimics how mathematics is usually written."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.29"

RPM_NAME = "genius-devel-1.0.29-2.3.aarch64.rpm"
RPM_HASH = "2f8c09da46d50819c2a4e1d692c2905d2c01784063c20e9d6fe533a551f2afe35d0d5bdce7caab20a0faa2e5a42a38446de9d61e56cf6353c85fc2f000c423e3"

RPROVIDES:${PN} += "genius-devel"

RDEPENDS:${PN} += "genius"

inherit rpm
