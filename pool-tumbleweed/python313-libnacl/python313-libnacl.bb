SUMMARY = "Python bindings for libsodium based on ctypes"
DESCRIPTION = "This library is used to gain direct access to the functions exposed by Daniel J. Bernstein's nacl library via libsodium. \
It has been constructed to maintain extensive documentation on how to use nacl as well as being completely portable. The file \
in libnacl/__init__.py can be pulled out and placed directly in any project to give a single file binding to all of nacl."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python313-libnacl-2.1.0-3.5.noarch.rpm"
RPM_HASH = "a7c65115c10982428e609f9e0c958bcf0ce57b82a7e46599c6976d8d4325d9da05a5a4fc63cc2812627276a926ed0b2b89cad0d90ec3feac2000d72da682aaff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-libnacl \
python3.13dist-libnacl \
python313-libnacl \
python3dist-libnacl"

RDEPENDS:${PN} += "libsodium26 \
python-abi"

inherit rpm
