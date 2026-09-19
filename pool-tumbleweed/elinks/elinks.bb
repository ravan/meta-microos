SUMMARY = "An advanced and well-established feature-rich text mode web browser"
DESCRIPTION = "ELinks is an advanced and well-established feature-rich text mode web \
(HTTP/FTP/..) browser. ELinks can render both frames and tables, is highly \
customizable and can be extended via Lua or Guile scripts. It is very portable \
and runs on a variety of platforms. Check the about page for a more complete \
description."
LICENSE = "GPL-2.0-or-later"

PV = "0.19.1"

RPM_NAME = "elinks-0.19.1-1.6.aarch64.rpm"
RPM_HASH = "9bc2e29dc1b393a56ec8857ea2d87d13f30b6a54e49fb40e3bf5da8d36589fea70b77c4233ad2182b38ed26da233cc8c1a86ba6e0526b1b29f30d35a39e27ae5"

RPROVIDES:${PN} += "elinks \
web-browser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcss.so.0 \
libcurl.so.4 \
libdom.so.0 \
libexpat.so.1 \
libgcc-s.so.1 \
libgpm.so.2 \
libgssapi-krb5.so.2 \
libidn2.so.0 \
libluajit-5.1.so.2 \
libm.so.6 \
libperl.so \
libruby4.0.so.4.0 \
libsqlite3.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libtre.so.5 \
libwapcaplet.so.0 \
libz.so.1 \
libzstd.so.1 \
perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
