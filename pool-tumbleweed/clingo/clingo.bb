SUMMARY = "A grounder and solver for logic programs"
DESCRIPTION = "Clingo is part of the Potassco project for Answer Set Programming \
(ASP). ASP offers a simple and powerful modeling language to describe \
combinatorial problems as logic programs. The clingo system then takes \
such a logic program and computes answer sets representing solutions \
to the given problem."
LICENSE = "MIT"

PV = "5.8.0"

RPM_NAME = "clingo-5.8.0-2.4.aarch64.rpm"
RPM_HASH = "ad2cf16d7bddd83c890d805ee03b819f6a249d8ca633bfb87d2da3ae4b342474351506f58c8bc62a8a1cc037f9c0eb9502de2dc989bd44603bd68d75edba5912"

RPROVIDES:${PN} += "clingo"

RDEPENDS:${PN} += "libc.so.6 \
libclingo.so.4 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libpython3.13.so.1.0 \
libstdc++.so.6"

inherit rpm
