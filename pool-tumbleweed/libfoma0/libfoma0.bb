SUMMARY = "Finite-state C library"
DESCRIPTION = "The library contains efficient implementations of all classical \
automata/transducer algorithms: determinization, minimization, epsilon-removal, \
composition, boolean operations. Also, more advanced construction methods are \
available: context restriction, quotients, first-order regular logic, \
transducers from replacement rules, etc."
LICENSE = "Apache-2.0"

PV = "0.10.0+git22"

RPM_NAME = "libfoma0-0.10.0+git22-1.9.aarch64.rpm"
RPM_HASH = "93ff6cdb23cc72c1a92c65dd285b21058fdbfb2073be45db5e6fe96edadbd05fa9d77c7d624b2ccea6154697aaab1f0019b8cc58c604e3cc7b9d7aee6b739b38"

RPROVIDES:${PN} += "libfoma.so.0 \
libfoma0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
