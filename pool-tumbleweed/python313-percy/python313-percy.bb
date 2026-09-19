SUMMARY = "Visual regression testing library"
DESCRIPTION = "Python client library for visual regression testing with Percy."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python313-percy-2.0.2-4.2.noarch.rpm"
RPM_HASH = "b18ebd0e7787c30890a5bf48c7a49936a3a2015f77eb43d4aa853fb12f2aed8e4225b26c399aa2408eeba18a56c896c2f6a730f2efd20a24e02ae429d746e968"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-percy \
python3.13dist-percy \
python313-percy \
python3dist-percy"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
