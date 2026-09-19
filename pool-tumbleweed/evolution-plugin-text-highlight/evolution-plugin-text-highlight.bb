SUMMARY = "Text highlight plugin for the Evolution groupware suite"
DESCRIPTION = "Adds support to highlight syntax of mails and their attachments."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.60.2"

RPM_NAME = "evolution-plugin-text-highlight-3.60.2-1.2.aarch64.rpm"
RPM_HASH = "317f8cec0aa90cc5554d28f2e2ee8ffb30a5b21dd20a6ff434c1dd1f3542ed8107c330c3a6f4c51118075db63947ccf26f9274cb3bfe7b8c5c35f7e3bc107db6"

RPROVIDES:${PN} += "evolution-plugin-text-highlight"

RDEPENDS:${PN} += "evolution \
highlight \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.67 \
libedataserver-1.2.so.27 \
libevolution-mail-formatter.so \
libevolution-mail.so \
libevolution-util.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libsoup-3.0.so.0"

inherit rpm
