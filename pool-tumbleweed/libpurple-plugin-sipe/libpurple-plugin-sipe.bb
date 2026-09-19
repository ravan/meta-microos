SUMMARY = "Libpurple third-party plugin for MS Skype for Business"
DESCRIPTION = "A third-party plugin for the libpurple multi-protocol instant \
messaging library. It implements the extended version of SIP/SIMPLE \
used by various products: \
 * Skype for Business. \
 * Microsoft Office 365. \
 * Microsoft Business Productivity Online Suite (BPOS). \
 * Microsoft Lync Server. \
 * Microsoft Office Communications Server (OCS 2007/2007 R2). \
 * Microsoft Live Communications Server (LCS 2003/2005). \
 * Reuters Messaging."
LICENSE = "GPL-2.0-or-later"

PV = "1.25.0"

RPM_NAME = "libpurple-plugin-sipe-1.25.0-4.8.aarch64.rpm"
RPM_HASH = "986a7ac4d21a800435bed6585164b769999e4ca9b83b4be87bd089a33f351744699ec2208bf023a5444b27f274d642bea761e5fe6a716a6a2a8d1f995c6de61b"

RPROVIDES:${PN} += "libpurple-plugin-sipe \
libsipe.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libfarstream-0.2.so.5 \
libfreerdp-shadow-subsystem2.so.2 \
libfreerdp-shadow2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmime-3.0.so.0 \
libgobject-2.0.so.0 \
libgssapi-krb5.so.2 \
libgstreamer-1.0.so.0 \
libgstrtp-1.0.so.0 \
libnspr4.so \
libnss3.so \
libpurple.so.0 \
libsmime3.so \
libwinpr2.so.2 \
libxml2.so.16"

inherit rpm
