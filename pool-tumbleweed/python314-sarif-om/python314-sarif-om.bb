SUMMARY = "Classes implementing the SARIF 2.1.0 object model"
DESCRIPTION = "Classes implementing the SARIF 2.1.0 object model."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "python314-sarif-om-1.0.4-3.5.noarch.rpm"
RPM_HASH = "a6480005f4c022c81163cc7667856ad2d7a29df68764dc4abc8c76e74d2af912f6e0da4d45fe3e80a5661c2cda2b4414a5f06147c30dc6d9c4d2610102fddc21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sarif-om \
python314-sarif-om \
python3dist-sarif-om"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-pbr"

inherit rpm
