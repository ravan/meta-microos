SUMMARY = "Manager for Python libraries' sample data files"
DESCRIPTION = "Pooch manages sample data files for Python libraries. It automatically \
downloads and stores them in a local directory, with support for versioning \
and checks for corruption."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "python313-pooch-1.9.0-1.2.noarch.rpm"
RPM_HASH = "c7b3e25c57c5032a474a1086c9958f1019883be54119abdeb6a231137c66d4b8454c6780c60034b6a10adf0e58f130717543e3a571f61ac8e05ba1f703b2cea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pooch \
python3.13dist-pooch \
python313-pooch \
python3dist-pooch"

RDEPENDS:${PN} += "python-abi \
python313-packaging \
python313-platformdirs \
python313-requests"

inherit rpm
