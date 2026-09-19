SUMMARY = "Zooming Predictive Text Entry System"
DESCRIPTION = "Dasher is a zooming predictive text entry system, designed for \
situations where keyboard input is impractical (for instance: \
accessibility or PDAs). It is usable with greatly limited amounts of \
physical input while still allowing high rates of text entry."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.0+199"

RPM_NAME = "dasher-5.0.0+199-3.4.aarch64.rpm"
RPM_HASH = "b17658023a380739fd4497c4ec61392bd2433ae040ce14b38540fb701a41908531894d31e0587029760d350e97ca17be7adf36711c6817ce67aa3106a4c76dbf"

RPROVIDES:${PN} += "dasher \
dasher-data-extras \
dasher-data-recommended"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatspi.so.0 \
libc.so.6 \
libcairo.so.2 \
libexpat.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6"

inherit rpm
