SUMMARY = "Free Pascal Compiler"
DESCRIPTION = "Freepascal is a free 32/64bit Pascal Compiler. It comes with a run-time \
library and is fully compatible with Turbo Pascal 7.0 and nearly Delphi \
compatible. Some extensions are added to the language, like function \
overloading and generics. Shared libraries can be linked. This package \
contains commandline compiler and utils. Provided units are the runtime \
library (RTL), free component library (FCL) and the base and extra \
packages."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "fpc-3.2.2-5.15.aarch64.rpm"
RPM_HASH = "5a79da0b393b11591b90191af6fbdd55aa2eb6bad91b29a46f37ebb2a7e9a4b88d67d46c78549f7476f6798e579954e1296daf6fc28d3170d43306623017a196"

RPROVIDES:${PN} += "config-fpc \
fpc \
libpas2jslib.so"

RDEPENDS:${PN} += "/usr/bin/sh \
binutils \
libc.so.6"

inherit rpm
