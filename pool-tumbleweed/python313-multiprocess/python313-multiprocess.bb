SUMMARY = "Better multiprocessing and multithreading in Python"
DESCRIPTION = "Better multiprocessing and multithreading in Python"
LICENSE = "BSD-3-Clause"

PV = "0.70.19"

RPM_NAME = "python313-multiprocess-0.70.19-1.4.noarch.rpm"
RPM_HASH = "dad5762152ae8a31b032d5e0b852c32f5309be2b2204d0569ca8c8eeb3bec5e2e2366c839eebb340cacbeb5fc30ce3643591ad78fa007e2296054d08c3416014"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-multiprocess \
python3.13dist-multiprocess \
python313-multiprocess \
python3dist-multiprocess"

RDEPENDS:${PN} += "python-abi \
python313-dill"

inherit rpm
