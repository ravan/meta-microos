SUMMARY = "Signatures for entire Python programs (library)"
DESCRIPTION = "This is the library for griffe package."
LICENSE = "ISC"

PV = "2.0.2"

RPM_NAME = "python313-griffelib-2.0.2-1.3.noarch.rpm"
RPM_HASH = "11499cdf3d245a70302e9c2b87f7e2701ac3e382197717d7e2003a8dfe073d156c734aced9c3669d8d432af2efeb5c2c6ddad897759fad7f2cc14f46754fc092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-griffelib \
python3.13dist-griffelib \
python313-griffelib \
python3dist-griffelib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
