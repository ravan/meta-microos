SUMMARY = "Common protobufs used in Google APIs"
DESCRIPTION = "googleapis-common-protos contains the python classes generated from the common \
protos in the googleapis_ repository."
LICENSE = "Apache-2.0"

PV = "1.75.1"

RPM_NAME = "python314-googleapis-common-protos-1.75.1-1.1.noarch.rpm"
RPM_HASH = "e8d45729dbb4e90550a8d51d061b62031a62bb86debf6ba639e250492cb45d0a5156fc726c591060a49637fd6ab2091c41f45333592dfb05a6bfaec32ad8543d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-googleapis-common-protos \
python314-googleapis-common-protos \
python3dist-googleapis-common-protos"

RDEPENDS:${PN} += "python-abi \
python314-protobuf"

inherit rpm
