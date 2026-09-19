SUMMARY = "Vietnamese engine for IBus input platform"
DESCRIPTION = "A Vietnamese engine for IBus input platform that uses Unikey."
LICENSE = "GPL-3.0-only"

PV = "0.6.1"

RPM_NAME = "ibus-unikey-0.6.1-16.6.aarch64.rpm"
RPM_HASH = "ff18cbbf09116cecc44418217c254ca6364f615afed81e7840c76200fca636ccdd2203806078dc254ec54836dc74c31d5a84802c8af28c8edafa177a868436f3"

RPROVIDES:${PN} += "ibus-unikey \
locale-ibus-vi"

RDEPENDS:${PN} += "ibus \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libibus-1.0.so.5 \
libstdc++.so.6"

inherit rpm
