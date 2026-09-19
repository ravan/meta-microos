SUMMARY = "Python bindings for GnuPG"
DESCRIPTION = "This package contains Python bindings for GnuPG"
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.0"

RPM_NAME = "python313-gpg-2.0.0-4.1.aarch64.rpm"
RPM_HASH = "a066424086aba15bea3bc672e512d5b0ed8c7ebe759bf3ca5792c570ca08956e483b577d4357dd6108dcf89351dc890754b5d9882a05aa3d154efecad21835f2"

RPROVIDES:${PN} += "python3-gpg \
python3.13dist-gpg \
python313-gpg \
python3dist-gpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.45 \
python-abi"

inherit rpm
