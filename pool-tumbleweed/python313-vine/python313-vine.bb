SUMMARY = "Python Promises"
DESCRIPTION = "Promises implementation for python."
LICENSE = "BSD-3-Clause"

PV = "5.1.0"

RPM_NAME = "python313-vine-5.1.0-2.9.noarch.rpm"
RPM_HASH = "c8c3f070f7e7db468e63901c9420d882688433d33b69bcf2fc267e6d2cd3bd4c36cff2cdb8f658bbc50875aa7c9db01db66a6520882d55fcaef95600dd2f1b79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vine \
python3.13dist-vine \
python313-vine \
python3dist-vine"

RDEPENDS:${PN} += "python-abi"

inherit rpm
