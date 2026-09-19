SUMMARY = "Library of C++ templates implementing universal Clifford algebras"
DESCRIPTION = "GluCat is a library of template classes which model the universal \
Clifford algebras over the field of real numbers, with arbitrary \
dimension and arbitrary signature. GluCat implements a model of each \
Clifford algebra corresponding to each non-degenerate quadratic form \
up to a maximum number of dimensions."
LICENSE = "LGPL-3.0-only"

PV = "0.13.0"

RPM_NAME = "python313-glucat-0.13.0-2.6.aarch64.rpm"
RPM_HASH = "fd84ab31f356d87312a715fd7d14ae464dd9afb768bcac670738337636c5c36b8fc60ecde30d67f8ae7839ed24f7f04460db20af299126b302657bf8c9281d8b"

RPROVIDES:${PN} += "python3-glucat \
python313-glucat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
