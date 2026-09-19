SUMMARY = "(c)lean, responsive, configurable theme for the Sphinx"
DESCRIPTION = "Alabaster is a visually (c)lean, responsive, configurable theme for the Sphinx documentation system. \
It requires Python 3.10 or newer and Sphinx 6.2 or newer."
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "python313-alabaster-1.0.0-1.9.noarch.rpm"
RPM_HASH = "820905113a7a322a5a57fe929758bf85a001b36ca0177ef4915b7fe402f546641f0c970f753c3e588e63815f8f3093fa78f763cc93029dea19478e827987580a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-alabaster \
python3.13dist-alabaster \
python313-alabaster \
python3dist-alabaster"

RDEPENDS:${PN} += "python-abi"

inherit rpm
