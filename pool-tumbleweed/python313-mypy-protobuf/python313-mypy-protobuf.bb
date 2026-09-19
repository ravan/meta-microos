SUMMARY = "Generate mypy stub files from protobuf specs"
DESCRIPTION = "Generate mypy stub files from protobuf specs."
LICENSE = "MIT"

PV = "3.2.0"

RPM_NAME = "python313-mypy-protobuf-3.2.0-1.26.noarch.rpm"
RPM_HASH = "c1b9e32d58d33261411f905ed46939fc9e0014856b02abc0ea966d6da0bc26de2218232d1ef23b7ded2d246e51b0337a823dc16587c31efa365eed1238ba1855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mypy-protobuf \
python3.13dist-mypy-protobuf \
python313-mypy-protobuf \
python3dist-mypy-protobuf"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-protobuf \
update-alternatives"

inherit rpm
