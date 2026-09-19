SUMMARY = "Module to extract semantic information about static Python code"
DESCRIPTION = "A module to extract semantic information about static Python code."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "python314-beniget-0.5.0-1.1.noarch.rpm"
RPM_HASH = "4e7d5cd1c09af0e8fbcf54ba8cc67838a22284e0f9ecb47569c76aa41770e7592f907698d8d49571e7c7d41f6d087cc0e25dae24faa1480ae413b32467165d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-beniget \
python314-beniget \
python3dist-beniget"

RDEPENDS:${PN} += "python-abi \
python314-gast"

inherit rpm
