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

RPM_NAME = "python313-Pint-0.25.3-2.3.noarch.rpm"
RPM_HASH = "59236f4b32a9433b20fc0e95f10ce3aaa12e3a35a5f30e555f0411b0e522fc4b5451e217d7fee592d07019fdf2698cf829f52c1776cb10fb99a7b8f55f865f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Pint \
python3.13dist-pint \
python313-Pint \
python3dist-pint"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-flexcache \
python313-flexparser \
python313-platformdirs \
python313-typing-extensions \
update-alternatives"

inherit rpm
