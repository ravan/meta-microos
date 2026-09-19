SUMMARY = "Sunpinyin module for ibus"
DESCRIPTION = "ibus-sunpinyin is a wrapper around SunPinyin which enables user to use \
SunPinyin with IBus framework."
LICENSE = "CDDL-1.0 | LGPL-2.1-only"

PV = "2.0.99.2"

RPM_NAME = "ibus-sunpinyin-2.0.99.2-4.11.aarch64.rpm"
RPM_HASH = "d19da2bdaa15956900042b883e7610836ca2527cbe5b85f1854dac34012507346389bd129946073880b108db78d8da7d03c6f39adc55b3e2dab02459376b82bd"

RPROVIDES:${PN} += "ibus-sunpinyin"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libibus-1.0.so.5 \
libstdc++.so.6 \
libsunpinyin.so.3 \
sunpinyin-data"

inherit rpm
