SUMMARY = "GAP: Knuth-Bendix on Monoids and Automatic Groups"
DESCRIPTION = "The kbmag package is a GAP interface to some C programs for running \
the Knuth-Bendix completion program on finite semigroup, monoid or \
group presentations, and for attempting to compute automatic \
structures of finitely presented groups."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.11"

RPM_NAME = "gap-kbmag-1.5.11-1.9.aarch64.rpm"
RPM_HASH = "b967beeb3b28f4e925ddeb6a64ab9a9c1d75b3a632c604436d9264c0b61379deb2a6087ef3fd27883931b3e9387ac48d0387fa8fc558af8aa35989481669ab87"

RPROVIDES:${PN} += "gap-kbmag"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
libc.so.6"

inherit rpm
