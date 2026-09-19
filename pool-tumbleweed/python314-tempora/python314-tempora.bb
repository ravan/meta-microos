SUMMARY = "Objects and routines pertaining to date and time (tempora)"
DESCRIPTION = "Objects and routines pertaining to date and time (tempora) \
 \
Modules include: \
* tempora (top level package module) contains miscellaneous utilities and constants. \
* timing contains routines for measuring and profiling. \
* schedule contains an event scheduler."
LICENSE = "MIT"

PV = "5.8.1"

RPM_NAME = "python314-tempora-5.8.1-2.4.noarch.rpm"
RPM_HASH = "f8a8473e47a44ceac3c3fb7852f57c7ff21f962500b8bc3db1452a3910e0fb1b9c3abb49913306a6c82dd88e4ac3c34a0fc85df8324e8a1d9c8bb05ad232e02b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-tempora \
python314-tempora \
python3dist-tempora"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-jaraco.functools \
python314-python-dateutil \
python314-tzdata"

inherit rpm
