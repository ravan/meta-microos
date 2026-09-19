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

RPM_NAME = "python314-enaml-0.19.0-1.5.aarch64.rpm"
RPM_HASH = "1bf40747ef170d1232717b649b6934d6fd2c8f6032d1f87179d5d9e41496a830cac4b5fb8e0a2bcab1aed28f21db2d4b1ad8e70954518884dd1b12a594960c7c"

RPROVIDES:${PN} += "python3.14dist-enaml \
python314-enaml \
python3dist-enaml"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python314-PyQt6 \
python314-QtPy \
python314-atom \
python314-bytecode \
python314-kiwisolver \
python314-ply \
update-alternatives"

inherit rpm
