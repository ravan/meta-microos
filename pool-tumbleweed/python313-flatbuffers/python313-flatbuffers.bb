SUMMARY = "The FlatBuffers serialization format for Python"
DESCRIPTION = "Python runtime library for use with the Flatbuffers serialization format."
LICENSE = "Apache-2.0"

PV = "25.2.10"

RPM_NAME = "python313-flatbuffers-25.2.10-2.5.noarch.rpm"
RPM_HASH = "2ea8965b7d69f4b1f4a74f1c6fcde3494061c25ca6ebf69a9023d54e8063ebc4a849572b08e5140a01fd9dcc080bca6348ddf7b5c8a866cd9b3c2ae2791c2495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flatbuffers \
python3.13dist-flatbuffers \
python313-flatbuffers \
python3dist-flatbuffers"

RDEPENDS:${PN} += "python-abi"

inherit rpm
