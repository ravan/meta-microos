SUMMARY = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20260703"

RPM_NAME = "python313-libqcow-20260703-1.4.aarch64.rpm"
RPM_HASH = "3c06e97228bc5a176b893ef4c4ae09931ed2e43a24f5385a8b2bfad767e6d43c119f4fb1ff9af624c4e02b8451038fbf29211aa40d11c7668c674f9b5b6bd2bc"

RPROVIDES:${PN} += "python3-libqcow \
python313-libqcow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libqcow.so.1 \
python-abi"

inherit rpm
