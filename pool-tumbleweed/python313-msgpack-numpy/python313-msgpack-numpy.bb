SUMMARY = "Numpy data serialization library using msgpack"
DESCRIPTION = "This package provides encoding and decoding routines that enable the \
serialization and deserialization of numerical and array data types \
provided by numpy using the highly efficient msgpack format. \
Serialization of Python's native complex data types is also supported."
LICENSE = "BSD-3-Clause"

PV = "0.4.8"

RPM_NAME = "python313-msgpack-numpy-0.4.8-2.5.noarch.rpm"
RPM_HASH = "a3a024e3ce62d05b4b220c4f61c33a48e8c4c7ecf70646b334b87c8e7e4fe0ed61a236e24dad492d4f305996019ae44a92cea779faec4fc98f512a77b42bf84e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msgpack-numpy \
python3.13dist-msgpack-numpy \
python313-msgpack-numpy \
python3dist-msgpack-numpy"

RDEPENDS:${PN} += "python-abi \
python313-msgpack \
python313-numpy"

inherit rpm
