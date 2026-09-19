SUMMARY = "Postfix plugin to support MySQL maps"
DESCRIPTION = "Postfix plugin to support MySQL maps. This library will be loaded by \
starting postfix if you'll access a postmap which is stored in mysql."
LICENSE = "EPL-2.0 | IPL-1.0"

PV = "3.11.7"

RPM_NAME = "postfix-mysql-3.11.7-1.1.aarch64.rpm"
RPM_HASH = "251698fbbe20dd71a7a14867cf2034b2b0fea828606d8d707101df0bcc3513936f4374016545ab7c9d31f4e92aa1c804e0e3b4da8f2d6ce07f6704b958f42ba8"

RPROVIDES:${PN} += "config-postfix-mysql \
group-vmail \
postfix-mysql \
user-vmail"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
group-postfix \
libc.so.6 \
libmariadb.so.3 \
postfix"

inherit rpm
