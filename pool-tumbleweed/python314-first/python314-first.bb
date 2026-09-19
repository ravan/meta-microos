SUMMARY = "Python library to return the first true value of an iterable"
DESCRIPTION = "A Python library that returns the first true value of an iterable."
LICENSE = "MIT"

PV = "2.0.2"

RPM_NAME = "python314-first-2.0.2-6.5.noarch.rpm"
RPM_HASH = "b9b5587660554d53110f677f7b12d80ecdf2951b17fb0eb54eaf5a91e75319095d1f09d24f46bf62aa2bbf3288170a3eb43768e948b5e7d27083c2e3196ff13b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-first \
python314-first \
python3dist-first"

RDEPENDS:${PN} += "python-abi"

inherit rpm
