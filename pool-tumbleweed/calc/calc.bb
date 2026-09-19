SUMMARY = "C-style arbitrary precision calculator"
DESCRIPTION = "Calc is arbitrary precision C-like arithmetic system that is a \
calculator, an algorithm prototype and mathematical research tool. \
Calc comes with a rich set of builtin mathematical and programmatic \
functions."
LICENSE = "LGPL-2.1-only"

PV = "2.17.0.0"

RPM_NAME = "calc-2.17.0.0-1.2.aarch64.rpm"
RPM_HASH = "aa421855bc58a6dc93adc0b4af71a6412c5c3a789326a70cd920e632100882c1c0a443f80400203658ff18b16b302f31865e2225121af9b3f653bc632aeda097"

RPROVIDES:${PN} += "calc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
less \
libc.so.6 \
libcalc.so.2.17.0.0 \
libcalc2-17-0-0 \
libcustcalc.so.2.17.0.0 \
libhistory.so.8"

inherit rpm
