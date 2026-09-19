SUMMARY = "A library for parsing ISO 8601 strings"
DESCRIPTION = "aniso8601 is a Python library for parsing date strings \
in ISO 8601 format into datetime format."
LICENSE = "BSD-3-Clause"

PV = "10.0.1"

RPM_NAME = "python313-aniso8601-10.0.1-1.5.noarch.rpm"
RPM_HASH = "f3e4041bc60f33a1e7c51681313e77d26e7eb6d07a59935909c40c68755f970127b575c90c71627fa09684007dae98dedfee64c24067d0c2e810136631097be0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aniso8601 \
python3.13dist-aniso8601 \
python313-aniso8601 \
python3dist-aniso8601"

RDEPENDS:${PN} += "python-abi"

inherit rpm
