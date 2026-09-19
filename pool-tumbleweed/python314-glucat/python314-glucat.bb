SUMMARY = "Library of C++ templates implementing universal Clifford algebras"
DESCRIPTION = "GluCat is a library of template classes which model the universal \
Clifford algebras over the field of real numbers, with arbitrary \
dimension and arbitrary signature. GluCat implements a model of each \
Clifford algebra corresponding to each non-degenerate quadratic form \
up to a maximum number of dimensions."
LICENSE = "LGPL-3.0-only"

PV = "0.13.0"

RPM_NAME = "python314-glucat-0.13.0-2.6.aarch64.rpm"
RPM_HASH = "e52ad4fc405b05b014d99a027a42e6be42296c65fc3a6931beb8963a9890a23167cb7d667a00cfc92703a17b60f349a94a42946186d2a8ba514066d1533cbe65"

RPROVIDES:${PN} += "python314-glucat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
