SUMMARY = "Objects and routines pertaining to date and time (tempora)"
DESCRIPTION = "Objects and routines pertaining to date and time (tempora) \
 \
Modules include: \
* tempora (top level package module) contains miscellaneous utilities and constants. \
* timing contains routines for measuring and profiling. \
* schedule contains an event scheduler."
LICENSE = "MIT"

PV = "5.8.1"

RPM_NAME = "python313-tempora-5.8.1-2.4.noarch.rpm"
RPM_HASH = "d133fcc81df2fc1fb88b2609c04ec5f2b81380feaa28912f8329d20dffe3c22918bfe226d6a1d420eec18c5312d23eda5a5eb5cc870d24ff4cde21b613cc1765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tempora \
python3.13dist-tempora \
python313-tempora \
python3dist-tempora"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-jaraco.functools \
python313-python-dateutil \
python313-tzdata"

inherit rpm
