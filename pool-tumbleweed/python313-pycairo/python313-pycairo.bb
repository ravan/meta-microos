SUMMARY = "Python Bindings for Cairo"
DESCRIPTION = "Pycairo is a Python module providing bindings for the cairo graphics library."
LICENSE = "LGPL-2.1-or-later | MPL-1.1"

PV = "1.29.1"

RPM_NAME = "python313-pycairo-1.29.1-1.1.aarch64.rpm"
RPM_HASH = "4bcfef43b865f26ba2f2376df79abe059d1993453c2fb4f97e588b6ae680a4a99cdc93e6e70322fe1d3f305211be2489d3529a453303f472b867ac9714839f89"

RPROVIDES:${PN} += "python3-cairo \
python3-pycairo \
python3.13dist-pycairo \
python313-cairo \
python313-pycairo \
python3dist-pycairo"

RDEPENDS:${PN} += "libc.so.6 \
libcairo.so.2 \
python-abi"

inherit rpm
