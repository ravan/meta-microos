SUMMARY = "A Python library for generating pseudorandom condition"
DESCRIPTION = "A package for pseudorandomization of DataMatrix objects. That is, it allows \
you to apply certain constraints to the randomization."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.2"

RPM_NAME = "python314-python-pseudorandom-0.3.2-1.8.noarch.rpm"
RPM_HASH = "33b0c9f80d91e2233773cb044251b7b7d0285e685eb1d63f9297ef01d38816dc8f57c20812f0ec5254090d2f1074f1721ad32236a665b8cddc1a89cc684168af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-pseudorandom \
python314-python-pseudorandom \
python3dist-python-pseudorandom"

RDEPENDS:${PN} += "python-abi \
python314-python-datamatrix"

inherit rpm
