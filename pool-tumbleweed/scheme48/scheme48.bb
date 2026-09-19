SUMMARY = "An implementation of Scheme written by Richard Kelsey and Jonathan Rees"
DESCRIPTION = "Scheme 48 is an implementation of the Scheme programming language as described \
in the Revised5 Report on the Algorithmic Language Scheme. It is based on a \
compiler and interpreter for a virtual Scheme machine. Scheme 48 tries to be \
faithful to the Revised5 Scheme Report, providing neither more nor less in \
the initial user environment."
LICENSE = "BSD-3-Clause"

PV = "1.9.3"

RPM_NAME = "scheme48-1.9.3-1.14.aarch64.rpm"
RPM_HASH = "2705812bec458f776678096cc24d5f2f97b174b8d998b11ab97a0aababe1af03e1539338940cf9f7f2c5c71ed999216dd2a73cf85dba4bc790f8ab811c584d37"

RPROVIDES:${PN} += "scheme48"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
scheme48-vm"

inherit rpm
