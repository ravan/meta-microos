SUMMARY = "C-style structs for Python"
DESCRIPTION = "Convert C struct definitions into Python classes with methods for \
serializing/deserializing. The usage is very simple: create a class \
subclassing cstruct.CStruct and add a C struct definition as a \
string in the struct field. The C struct definition is parsed at \
runtime and the struct format string is generated. The class offers \
the method 'unpack' for deserializing a string of bytes into a \
Python object and the method 'pack' for serializing the values into \
a string."
LICENSE = "MIT"

PV = "6.2"

RPM_NAME = "python313-cstruct-6.2-1.2.noarch.rpm"
RPM_HASH = "7e5fccecef1bc2616b553dd53323e3fde8be901dccb1ac281b0d38a28fdf476855c1bf9e0979263d7758878b48c2aa318a09aac6f2a552271a311854818c59b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cstruct \
python3.13dist-cstruct \
python313-cstruct \
python3dist-cstruct"

RDEPENDS:${PN} += "python-abi"

inherit rpm
