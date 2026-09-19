SUMMARY = "Python 3 bindings for Clingo"
DESCRIPTION = "This module provides functions and classes to work with ground terms and to \
control the instantiation process. In clingo builts, additional functions to \
control and inspect the solving process are available. \
 \
Functions defined in a python script block are callable during the \
instantiation process using @-syntax. The default grounding/solving process can \
be customized if a main function is provided. \
 \
Detailed information (including a User's manual), source code, and pre-compiled \
binaries are available at: http://potassco.org/"
LICENSE = "MIT"

PV = "5.8.0"

RPM_NAME = "python3-clingo-5.8.0-2.4.aarch64.rpm"
RPM_HASH = "d2a427ca2682a1a2ded04d439901298220741d9474c07db22a893eaab11706b92ee73be6762e0bb66210a1030508a95b70fec5c70198e03dc9dc6319346957ad"

RPROVIDES:${PN} += "python3-clingo \
python3.13dist-clingo \
python3dist-clingo"

RDEPENDS:${PN} += "clingo \
libc.so.6 \
libclingo.so.4 \
python-abi \
python3-cffi"

inherit rpm
