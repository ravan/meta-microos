SUMMARY = "A Library for Posting Electronic Mail"
DESCRIPTION = "libESMTP is a library to manage posting (or submission of) electronic \
mail using SMTP to a preconfigured Mail Transport Agent (MTA). It may \
be used as part of a Mail User Agent (MUA) or another program that \
must be able to post electronic mail but where mail functionality is \
not that program's primary purpose."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libesmtp6_2_0-1.1.0-3.7.aarch64.rpm"
RPM_HASH = "2c1fdc72c27f56f3933fd7a67eb8ed3819066d6ca0811c83730acfd675da74403d16c4940375f9bcf94aa586ab50b8613929b4eada2d009c11898b7ec7991252"

RPROVIDES:${PN} += "libesmtp.so.6.2.0 \
libesmtp6-2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
