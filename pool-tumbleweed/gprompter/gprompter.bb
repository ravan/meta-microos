SUMMARY = "Intelligent predictive GTK+ text editor"
DESCRIPTION = "gprompter is a cross-platform predictive text editor, based on presage, the intelligent predictive text entry platform. \
 \
gprompter displays predictions in a contextual pop-up box as each letter is typed. Predictions can be easily selected and inserted in the document."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "gprompter-0.9.1-18.6.aarch64.rpm"
RPM_HASH = "bb4b42d98a612feaeb58fa2ad9eee3cf5538ee7c1caa757ba8175e745249f75a61f2b84db0eb8089a3b09a823731105e9c179ec8e016becc2c82231c06d02758"

RPROVIDES:${PN} += "gprompter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpresage.so.1 \
libstdc++.so.6"

inherit rpm
