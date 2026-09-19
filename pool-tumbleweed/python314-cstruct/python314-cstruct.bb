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

RPM_NAME = "python314-cstruct-6.2-1.2.noarch.rpm"
RPM_HASH = "995d364657746df85abca66f67b3980fc529fe834c2a846180956287b59503cbe4a1c1443bef7d212a9cf14822a697f5433efecc4c7370c9886b6e329e5205f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cstruct \
python314-cstruct \
python3dist-cstruct"

RDEPENDS:${PN} += "python-abi"

inherit rpm
