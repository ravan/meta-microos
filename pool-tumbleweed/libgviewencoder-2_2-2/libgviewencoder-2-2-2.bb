SUMMARY = "GTK+ UVC Viewer and Capturer"
DESCRIPTION = "A GTK interface for capturing and viewing video from devices \
supported by the Linux UVC driver, although it should also work with \
any v4l2 compatible device."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.2"

RPM_NAME = "libgviewencoder-2_2-2-2.2.2-1.7.aarch64.rpm"
RPM_HASH = "2b24c7460d386afa1d2a999491c9d7babd0cc115520ec6ed6608524822a9ad2be6bdc0564ff7a811afb39b615332ca8169b037240083c630336a9bfa2908cd7f"

RPROVIDES:${PN} += "libgviewencoder-2-2-2 \
libgviewencoder.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavutil.so.60 \
libc.so.6 \
libm.so.6"

inherit rpm
