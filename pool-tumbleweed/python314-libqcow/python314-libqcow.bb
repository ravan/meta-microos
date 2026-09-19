SUMMARY = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library and tooling to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20260703"

RPM_NAME = "python314-libqcow-20260703-1.4.aarch64.rpm"
RPM_HASH = "53eb86b7bea5b0ef2913bf36809f98d4404bec368c49a888b82bde29fc3fead57a408f178d39916d75446e062598f2647a3659c631368e2320db11ec37693543"

RPROVIDES:${PN} += "python314-libqcow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libqcow.so.1 \
python-abi"

inherit rpm
