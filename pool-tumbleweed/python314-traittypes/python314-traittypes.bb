SUMMARY = "Scipy trait types"
DESCRIPTION = "Custom trait types for scientific computing."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python314-traittypes-0.2.1-11.10.noarch.rpm"
RPM_HASH = "011486c1b9431b29efc272a7ac4c7b7c9661165520a9c05b586a80d29a28bfcd99b6a3768271c6aeedbb13279d1bf9430e1b568b982ff276ec5050804a1d0787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-traittypes \
python314-traittypes \
python3dist-traittypes"

RDEPENDS:${PN} += "python-abi \
python314-traitlets"

inherit rpm
