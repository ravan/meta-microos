SUMMARY = "Application to manage personal accounts"
DESCRIPTION = "HomeBank is an application to manage personal accounts at home. The main \
concept is to be light, simple and very easy to use. It brings many \
features that allows to analyze finances in a detailed way instantly and \
dynamically with powerful report tools based on filtering and graphical \
charts."
LICENSE = "GPL-2.0-or-later"

PV = "5.10.2"

RPM_NAME = "homebank-5.10.2-1.2.aarch64.rpm"
RPM_HASH = "85da48d38fcd0920772e289882c9b4449b420e7e3375badad3d01b1f8733268d67836b774bb7adc1b3548dc7baeab5882bc2af15bb14dd672b961a0f517bd5a0"

RPROVIDES:${PN} += "homebank"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libofx.so.7 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsoup-3.0.so.0"

inherit rpm
