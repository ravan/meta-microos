SUMMARY = "Physical quantities module"
DESCRIPTION = "Pint is Python module/package to define, operate and manipulate physical \
quantities, the product of a numerical value and a unit of measurement. \
It allows arithmetic operations between them and conversions from and \
to different units. \
 \
It is distributed with a comprehensive list of physical units, prefixes \
and constants. Due to it's modular design, you to extend (or even rewrite!) \
the complete list without changing the source code."
LICENSE = "BSD-3-Clause"

PV = "0.25.3"

RPM_NAME = "python314-Pint-0.25.3-2.3.noarch.rpm"
RPM_HASH = "c6bcef474aa69f3a759fccb7aafe78bb68410d8bb1f226386c85db6fa8da1366509d83738cfc4a2a3d82db5d8d65dd8ec7a63ba723a25b2835fcad46ee398a45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pint \
python314-Pint \
python3dist-pint"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-flexcache \
python314-flexparser \
python314-platformdirs \
python314-typing-extensions \
update-alternatives"

inherit rpm
