SUMMARY = "Calculation of piecewise linear interpolations in multiple dimensions"
DESCRIPTION = "MutatorMath is a Python library for the calculation of piecewise linear \
interpolations in n-dimensions with any number of masters. It was \
developed for interpolating data related to fonts, but if can handle any \
arithmetic object."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python313-mutatorMath-3.0.1-5.5.noarch.rpm"
RPM_HASH = "02bf4c652eeee50a9020a31fbba1534373a868971fb3afba7d30c2779432897fdc9ecc1ea238fa00a1788725d1a72dacf6055fd0d30100ec0f8d48da514bb799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mutatorMath \
python3.13dist-mutatormath \
python313-mutatorMath \
python3dist-mutatormath"

RDEPENDS:${PN} += "python-abi \
python313-FontTools \
python313-defcon \
python313-fontMath \
python313-fs"

inherit rpm
