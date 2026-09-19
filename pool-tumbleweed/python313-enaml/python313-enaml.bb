SUMMARY = "Declarative DSL for building rich user interfaces in Python"
DESCRIPTION = "Enaml is a programming language and framework for creating \
professional quality user interfaces with minimal effort. \
Enaml combines a domain specific declarative language with \
a constraints based layout system to allow users to easily \
define rich UIs with complex and flexible layouts. Enaml \
applications can be run on any platform which supports \
Python and Qt."
LICENSE = "BSD-3-Clause & LGPL-2.1-only"

PV = "0.19.0"

RPM_NAME = "python313-enaml-0.19.0-1.5.aarch64.rpm"
RPM_HASH = "ba26b45b6e15e788916ec8942665ee5abf6073bf6d5c2da3a3ccf4717ecd949b1959b72554256bdd5bf743bbe1adbfb587f012992120999ffbcf3806d5fa5bd4"

RPROVIDES:${PN} += "python3-enaml \
python3.13dist-enaml \
python313-enaml \
python3dist-enaml"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python313-QtPy \
python313-atom \
python313-bytecode \
python313-kiwisolver \
python313-ply \
update-alternatives"

inherit rpm
