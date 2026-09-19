SUMMARY = "Numpy data serialization library using msgpack"
DESCRIPTION = "This package provides encoding and decoding routines that enable the \
serialization and deserialization of numerical and array data types \
provided by numpy using the highly efficient msgpack format. \
Serialization of Python's native complex data types is also supported."
LICENSE = "BSD-3-Clause"

PV = "0.4.8"

RPM_NAME = "python314-msgpack-numpy-0.4.8-2.5.noarch.rpm"
RPM_HASH = "48f6c2e902b14c88dc6227e842b3fb0380d6a4e160ce41d1f77a6e5fdd1ba087006b3089874cf981b21a4815bb32cc778cb61d255ecb981ab7608c21920449fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-msgpack-numpy \
python314-msgpack-numpy \
python3dist-msgpack-numpy"

RDEPENDS:${PN} += "python-abi \
python314-msgpack \
python314-numpy"

inherit rpm
