SUMMARY = "MATE disk image mounter"
DESCRIPTION = "This is the MATE Disk Image Mounter as shipped with the MATE \
utilities. mate-disk-image-mounter shows up in Caja for .ISO files \
to be conviniently mounted."
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-disk-image-mounter-1.28.0-2.6.aarch64.rpm"
RPM_HASH = "b93b5f630342bf7ea72a3ac0c4695fa0a208fdd51cc1a3635da4dfa33e175a6c3f4cfd9837ff58d794d09c6fe63dd80f63fc1e650a7cfda7a79b6129a7bb6a11"

RPROVIDES:${PN} += "mate-disk-image-mounter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libudisks2.so.0"

inherit rpm
