SUMMARY = "A library for parsing and manipulating RPM spec files"
DESCRIPTION = "A library for parsing and manipulating RPM spec files."
LICENSE = "MIT"

PV = "0.41.0"

RPM_NAME = "python314-specfile-0.41.0-1.2.noarch.rpm"
RPM_HASH = "c59e048debe1ff792607607ea67a40499660af1a61b0c9608a58365b452c1fa05bbab2673737ef273b76eba8b90114dc605f18e4f111cdb883e1bb0f2f3f0570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-specfile \
python314-specfile \
python3dist-specfile"

RDEPENDS:${PN} += "python-abi \
python314-rpm"

inherit rpm
