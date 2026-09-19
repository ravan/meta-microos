SUMMARY = "Tool to Undelete Files"
DESCRIPTION = "PhotoRec is a file data recovery software designed to recover lost files \
including video, documents and archives from hard disks and CD Rom and lost \
pictures (Photo Recovery) from digital camera memory. PhotoRec ignores the \
filesystem and goes after the underlying data, so it works even if your media's \
filesystem is severely damaged or reformatted."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "photorec-7.2-1.11.aarch64.rpm"
RPM_HASH = "5eb4ba2abc88cd37e0fbfab084e22c5093b55b59b7bee8d580505ed416a6947e09995dfc38550114a862d182be409cf56233c336985e27cf66edf6e66111e67b"

RPROVIDES:${PN} += "photorec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libext2fs.so.2 \
libjpeg.so.8 \
libncursesw.so.6 \
libntfs-3g.so.90 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
