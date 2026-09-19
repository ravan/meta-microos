SUMMARY = "Milter unit test utility"
DESCRIPTION = "Simulates the MTA side of an MTA-milter interaction for testing a milter-aware \
filter application.  It takes as input a script using the Lua language, \
and by exporting some utility functions, makes it possible for users to \
write scripts that exercise a filter."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "miltertest-1.6.0-13.5.aarch64.rpm"
RPM_HASH = "ef559442a5e55d90cb36d2d958ecc3b1c86e38a9114c65a1649c76ace52f9b4d108fdba806f0453d2843e714fbe7e4d893842e7ea9efaadf8cb289c5ae446ebf"

RPROVIDES:${PN} += "miltertest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.3.so.5"

inherit rpm
