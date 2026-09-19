SUMMARY = "Python API for configuring sssd"
DESCRIPTION = "Provide python module to access and manage configuration of the System \
Security Services Daemon (sssd)."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "python3-sssd-config-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "dc36d8cecfe303fe73a3ad4d7e71f3ac09b797ac76828a56f24bede3d40071eb00e15d97c7896161ac66e69dc0d953361f942a98eaa96053cab77844cfbdef7f"

RPROVIDES:${PN} += "python3-sssd-config \
python3.13dist-sssdconfig \
python3dist-sssdconfig"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldb.so.2 \
libpopt.so.0 \
libsss-crypt.so \
libsss-debug.so \
libsss-util.so \
libtalloc.so.2 \
python-abi \
python3"

inherit rpm
