SUMMARY = "Python binding to the Networking and Cryptography (NaCl) library"
DESCRIPTION = "PyNaCl is a Python binding to the `Networking and Cryptography library`_, \
a crypto library with the stated goal of improving usability, security and \
speed."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "python313-PyNaCl-1.6.2-1.6.aarch64.rpm"
RPM_HASH = "3212e6ea60a5e61c5a3ca17cf9d8cdaba0f479123de72d56bc6b4a61d6c284029b7f42416bb8a4664f72592eb5696e4e5b7dfe146b0306d126993f0d131c9cac"

RPROVIDES:${PN} += "python3-PyNaCl \
python3.13dist-pynacl \
python313-PyNaCl \
python3dist-pynacl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsodium.so.26 \
python-abi \
python313-cffi"

inherit rpm
