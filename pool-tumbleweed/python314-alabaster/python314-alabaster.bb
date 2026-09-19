SUMMARY = "(c)lean, responsive, configurable theme for the Sphinx"
DESCRIPTION = "Alabaster is a visually (c)lean, responsive, configurable theme for the Sphinx documentation system. \
It requires Python 3.10 or newer and Sphinx 6.2 or newer."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python314-alabaster-1.0.0-1.9.noarch.rpm"
RPM_HASH = "5462f161a5e985a51763b0e011fa59ff28194f4320e3de700f89d9d8043a3e4793bba368c48dde395427c8a0b4f7a8b39b5bb526ffe0661f7e6bf14b5cd94762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-alabaster \
python314-alabaster \
python3dist-alabaster"

RDEPENDS:${PN} += "python-abi"

inherit rpm
