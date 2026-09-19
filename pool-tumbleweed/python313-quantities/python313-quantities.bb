SUMMARY = "Package for physical quantities with units"
DESCRIPTION = "Support for physical quantities with units, based on numpy."
LICENSE = "BSD-3-Clause"

PV = "0.16.4"

RPM_NAME = "python313-quantities-0.16.4-1.5.noarch.rpm"
RPM_HASH = "a42a8f6113bd9d883d5e2200bbf8fae03647a3f2fac6e42818bea0951fb0047ef75c3f88b10f7550511f43196e95c7431bb44a3c05dabe0512d3c29ec1b53c05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-quantities \
python3.13dist-quantities \
python313-quantities \
python3dist-quantities"

RDEPENDS:${PN} += "python-abi \
python313-numpy"

inherit rpm
