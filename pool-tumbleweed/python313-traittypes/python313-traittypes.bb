SUMMARY = "Scipy trait types"
DESCRIPTION = "Custom trait types for scientific computing."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "python313-traittypes-0.2.1-11.10.noarch.rpm"
RPM_HASH = "202bb8c9ecc9527892b7093539f204cb3798ccc13c6a0dce4d5554cfd131b9827dbcb11b221a1c6f19e93e73622e8e6066d25db201783ab1c556ecc7db919b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-traittypes \
python3.13dist-traittypes \
python313-traittypes \
python3dist-traittypes"

RDEPENDS:${PN} += "python-abi \
python313-traitlets"

inherit rpm
