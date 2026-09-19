SUMMARY = "Manager for Python libraries' sample data files"
DESCRIPTION = "Pooch manages sample data files for Python libraries. It automatically \
downloads and stores them in a local directory, with support for versioning \
and checks for corruption."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "python314-pooch-1.9.0-1.2.noarch.rpm"
RPM_HASH = "a950971d5c3414ca3fa4c6d13d6c4920fae4ffdd512de15ece8da74803758a290b0ab001e8c3e40be23b0046bc0e8150aebec074e9a9d3b0f221c1aa361c8ec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pooch \
python314-pooch \
python3dist-pooch"

RDEPENDS:${PN} += "python-abi \
python314-packaging \
python314-platformdirs \
python314-requests"

inherit rpm
