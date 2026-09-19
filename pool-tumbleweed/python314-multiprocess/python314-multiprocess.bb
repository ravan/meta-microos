SUMMARY = "Better multiprocessing and multithreading in Python"
DESCRIPTION = "Better multiprocessing and multithreading in Python"
LICENSE = "BSD-3-Clause"

PV = "0.70.19"

RPM_NAME = "python314-multiprocess-0.70.19-1.4.noarch.rpm"
RPM_HASH = "01fce693c696b14b2965f5ebe97fceee195e91a3fd22fa684a8e0180cfe20abac915a451742877654cbf3da32f0a113a977f76f19ae7821214ca07e088e37653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-multiprocess \
python314-multiprocess \
python3dist-multiprocess"

RDEPENDS:${PN} += "python-abi \
python314-dill"

inherit rpm
