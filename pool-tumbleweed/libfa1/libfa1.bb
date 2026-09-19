SUMMARY = "Finite automaton library for Augeas"
DESCRIPTION = "Component library for the Augeas configuration parser."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "libfa1-1.14.1-2.6.aarch64.rpm"
RPM_HASH = "641a2b34ceceb3a6422047bbbe4e326f9e6a10afb9fa0ba72d96020bf19de3fd1ca1b0ce98e03dce7924a1d410df50477d76c5263cd267bf27864a3e9b972ab4"

RPROVIDES:${PN} += "libfa.so.1 \
libfa1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
