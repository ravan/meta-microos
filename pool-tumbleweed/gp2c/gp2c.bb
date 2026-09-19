SUMMARY = "GP script to PARI C program compiler"
DESCRIPTION = "The gp2c compiler is a package for translating GP routines into the C \
programming language, so that they can be compiled and used with the PARI \
system or the GP calculator. \
 \
The main advantage of doing this is to speed up computations and to include \
your own routines within the preexisting GP ones. It may also find bugs in GP \
scripts."
LICENSE = "GPL-2.0-only"

PV = "0.0.14pl1"

RPM_NAME = "gp2c-0.0.14pl1-1.4.aarch64.rpm"
RPM_HASH = "4adce46c5ab937528961cf38a9ebf28a0400921629a59e8e9c75a4773512a60f0df35c6dd846e49693a7fe9c0ee99726d5ad1a464a44b4173caaac92977e405e"

RPROVIDES:${PN} += "gp2c"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
