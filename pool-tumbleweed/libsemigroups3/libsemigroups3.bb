SUMMARY = "Library with algorithms for computing finite and finitely presented semigroups"
DESCRIPTION = "A C++14 library containing implementations of several algorithms for \
computing finite and finitely presented semigroups, namely: \
 \
* the Froidure–Pin algorithm for computing finite semigroups \
* the Todd–Coxeter and Knuth–Bendix algorithms for finitely \
  presented semigroups and monoids; \
* the Schreier–Sims algorithm for permutation groups"
LICENSE = "GPL-3.0-or-later"

PV = "3.6.1"

RPM_NAME = "libsemigroups3-3.6.1-1.3.aarch64.rpm"
RPM_HASH = "84d185a0a408ed7875dd0430bde4583fd164f67423cbb9fc96cf5902312d8ce284e0d770d5ed4b04c7a97ad5c0affe4acebbe59fb5b7d1635015fb1dddfa0b8a"

RPROVIDES:${PN} += "libsemigroups.so.3 \
libsemigroups3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfmt.so.12 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
