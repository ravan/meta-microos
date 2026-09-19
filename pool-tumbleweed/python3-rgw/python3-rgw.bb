SUMMARY = "Python 3 libraries for the RADOS gateway"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph RADOS \
gateway."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "python3-rgw-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "e7caab6426223c3623b268f095196a8efb275d69cd39979c0dba598be968f3b30e643790b56325a19d5493db503345fe2cf0c84c009172596ff1c245a05d37ca"

RPROVIDES:${PN} += "python-rgw \
python3-rgw \
python3.13dist-rgw \
python3dist-rgw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librgw.so.2 \
librgw2 \
python-abi \
python3-rados"

inherit rpm
