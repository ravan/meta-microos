SUMMARY = "A tool for static C/C++ code analysis"
DESCRIPTION = "This program tries to detect bugs that your C/C++ compiler don't see. Cppcheck \
is versatile. You can check non-standard code that includes various compiler \
extensions, inline assembly code, etc. Checking covers for example these \
errors: \
 \
 * Out of bounds \
 * Uninitialized member variable 'classname::varname' \
 * Using 'memfunc' on class \
 * Using 'memfunc' on struct that contains a 'std::classname' \
 * Class Base which is inherited by class Derived does not have a virtual \
   destructor \
 * Memory leak: varname \
 * Resource leak: varname \
 * Deallocating a deallocated pointer: varname \
 * Using 'varname' after it is deallocated / released \
 * Invalid radix in call to strtol or strtoul. Must be 0 or 2-36 \
 * Overlapping data buffer varname \
 * Unsigned division. The result will be wrong. \
 * Unusual pointer arithmetic"
LICENSE = "GPL-3.0-or-later"

PV = "2.21.0"

RPM_NAME = "cppcheck-2.21.0-1.2.aarch64.rpm"
RPM_HASH = "bd42a4a105b30ca616060dffd2d38ee39e1fa579e35491a1028d910384b5b785f6bc2f639bd566f99a16f05c5a1863d0754976f25fe032bc09ec71392c7a5666"

RPROVIDES:${PN} += "cppcheck"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python3-Pygments"

inherit rpm
