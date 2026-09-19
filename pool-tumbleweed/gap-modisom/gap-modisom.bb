SUMMARY = "GAP: Computing with nilpotent associative algebras"
DESCRIPTION = "ModIsom is a GAP package containing various methods for computing \
with nilpotent associative algebras. It has a method to determine the \
automorphism group and to test isomorphis of such algebras over \
finite fields and of modular group algebras of finite p-groups, and \
it contains a nilpotent quotient algorithm for finitely presented \
associative algebras and a method to determine Kurosh algebras."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.0"

RPM_NAME = "gap-modisom-3.1.0-1.3.aarch64.rpm"
RPM_HASH = "2d10ca00fd3515d4d0f2609dec1a13c16e7399c42e8ce0670d6d4fe8544fd6f4c89e28fb985895c84dd3106482df8d5ad259c863fbdadb50639742de0ee43ebf"

RPROVIDES:${PN} += "gap-modisom"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-laguna \
gap-polycyclic"

inherit rpm
