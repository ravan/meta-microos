SUMMARY = "Python bindings for libsodium based on ctypes"
DESCRIPTION = "This library is used to gain direct access to the functions exposed by Daniel J. Bernstein's nacl library via libsodium. \
It has been constructed to maintain extensive documentation on how to use nacl as well as being completely portable. The file \
in libnacl/__init__.py can be pulled out and placed directly in any project to give a single file binding to all of nacl."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python314-libnacl-2.1.0-3.5.noarch.rpm"
RPM_HASH = "e69cf236536a66398d6001b27e0a12c3c70c3ee0b0d105a4b9cf7b5c22d95a3d014ac2b8cfc1115b9b17fc7ad18eefbd1944e4b1c0563f2bf6112f8656c3fad3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-libnacl \
python314-libnacl \
python3dist-libnacl"

RDEPENDS:${PN} += "libsodium26 \
python-abi"

inherit rpm
