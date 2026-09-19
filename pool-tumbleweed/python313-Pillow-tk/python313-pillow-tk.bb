SUMMARY = "Python Imaging Library (Fork) - Tcl/Tk Module"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "12.3.0"

RPM_NAME = "python313-Pillow-tk-12.3.0-2.2.aarch64.rpm"
RPM_HASH = "e82bf92f3b9ae1163e77e9312405f176afa37576d2066ebf977a6749c101e630e04e92dd69426b7eb894f454f8eb6c3f53120a81b077b7daa4445ba399fcb73b"

RPROVIDES:${PN} += "python3-Pillow-tk \
python313-Pillow-tk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-Pillow \
python313-tk"

inherit rpm
