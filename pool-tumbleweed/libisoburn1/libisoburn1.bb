SUMMARY = "Frontend for libburn and libisofs"
DESCRIPTION = "Libisoburn is a frontend for libraries libburn and libisofs which enables \
creation and expansion of ISO-9660 filesystems on all CD/DVD/BD media supported \
by libburn. This includes media like DVD+RW, which do not support multi-session \
management on media level and even plain disk files or block devices. Since it \
specializes on data files in ISO-9660 filesystem images it is not suitable for \
audio (CD-DA) or any other CD layout which does not entirely consist of \
ISO-9660 sessions."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.8"

RPM_NAME = "libisoburn1-1.5.8-1.2.aarch64.rpm"
RPM_HASH = "b28bbbc1c3ba42acde8e06719aa7b9b13de058910e284b876daca95168ce92a3f4ab45c446fe2d8ca75717eef0b7b3084ff268eddca19e8a7488b4ccfd4e87bb"

RPROVIDES:${PN} += "libisoburn.so.1 \
libisoburn1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libburn.so.4 \
libc.so.6 \
libisofs.so.6 \
libjte.so.2 \
libreadline.so.8"

inherit rpm
