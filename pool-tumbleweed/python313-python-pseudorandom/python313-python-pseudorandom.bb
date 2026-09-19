SUMMARY = "A Python library for generating pseudorandom condition"
DESCRIPTION = "A package for pseudorandomization of DataMatrix objects. That is, it allows \
you to apply certain constraints to the randomization."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.2"

RPM_NAME = "python313-python-pseudorandom-0.3.2-1.8.noarch.rpm"
RPM_HASH = "1e145e68411a3ab5419e5d0b33122aade16e99904748d4ab7cb32b463c5bf6c8aa55eeb887e2fe7f6051237eb04413aac82381c168e7deae215ee4ff70e9083e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-pseudorandom \
python3.13dist-python-pseudorandom \
python313-python-pseudorandom \
python3dist-python-pseudorandom"

RDEPENDS:${PN} += "python-abi \
python313-python-datamatrix"

inherit rpm
