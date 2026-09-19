SUMMARY = "Text Progressbar Library for Python"
DESCRIPTION = "This library provides a text mode progressbar. This is tipically used to \
display the progress of a long running operation, providing a visual clue that \
processing is underway."
LICENSE = "BSD-3-Clause | LGPL-2.1-or-later"

PV = "2.5"

RPM_NAME = "python313-progressbar-2.5-4.5.noarch.rpm"
RPM_HASH = "886884b8b738960eccdfe002e57633d3a377f78af25dbe1dcea88f6283557bb111f9570df0e061b058ec3b1d789c22d2abb69753c16bd1aa5e173b2bdc1467b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-progressbar \
python3.13dist-progressbar \
python313-progressbar \
python3dist-progressbar"

RDEPENDS:${PN} += "python-abi"

inherit rpm
