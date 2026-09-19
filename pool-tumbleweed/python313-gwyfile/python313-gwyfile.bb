SUMMARY = "Pure Python implementation of the Gwyddion file format"
DESCRIPTION = "Pure Python implementation of the Gwyddion file format."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python313-gwyfile-0.3.0-1.2.noarch.rpm"
RPM_HASH = "f59a6f6f23f16a28362236702a450469da5d4e1fa2fe2a12b5f3cd2c1e3799f218601638a1fd1d64c74f74a9154992f5bd761a504704358a792b571de8b53f4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gwyfile \
python3.13dist-gwyfile \
python313-gwyfile \
python3dist-gwyfile"

RDEPENDS:${PN} += "python-abi \
python313-numpy"

inherit rpm
