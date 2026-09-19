SUMMARY = "GNU's Ubiquitous Intelligent Language for Extension"
DESCRIPTION = "This is Guile, a portable, embeddable Scheme implementation written in \
C. Guile provides a machine independent execution platform that can be \
linked in as a library when building extensible programs."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.0.11"

RPM_NAME = "guile-3.0.11-1.1.aarch64.rpm"
RPM_HASH = "685f40f527530345cc71e35fb73f17dc7c7c0a54f3d39831d59273eefc74e9499f6259cf3e8559d30a6d3fd600f5c08a4e3a1412dbdc657fc5372b8dea252bf5"

RPROVIDES:${PN} += "guile"

RDEPENDS:${PN} += "/usr/bin/sh \
fileutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libguile-3.0.so.1 \
sh-utils"

inherit rpm
