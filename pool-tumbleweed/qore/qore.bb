SUMMARY = "Multithreaded Programming Language"
DESCRIPTION = "Qore is a scripting language supporting threading and embedded logic. \
It applies a scripting-based approach to interface development and \
can also be used as a general purpose language."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later | MIT"

PV = "2.2.1"

RPM_NAME = "qore-2.2.1-1.1.aarch64.rpm"
RPM_HASH = "08f1df9fb98262984b9dbe8e4f4a19fa5d3a31be28b39727875b34c10aa6e37ca737503ec88f4a382b99effcbb34a032707ce7045fa9263114b23ac7f0002aeb"

RPROVIDES:${PN} += "qore"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libqore.so.12 \
libstdc++.so.6 \
shared-mime-info"

inherit rpm
