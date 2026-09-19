SUMMARY = "Python bindings for GnuPG"
DESCRIPTION = "This package contains Python bindings for GnuPG"
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.0"

RPM_NAME = "python314-gpg-2.0.0-4.1.aarch64.rpm"
RPM_HASH = "ee6a51647228ca08af91bbc3db2e4af6730f0e5e7ab9eb4126a3de93cf05fa68729b1fd5867bc8ad115702e852f5be3cb360aa3cade1b42bb679bf556deac39c"

RPROVIDES:${PN} += "python3.14dist-gpg \
python314-gpg \
python3dist-gpg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.45 \
python-abi"

inherit rpm
