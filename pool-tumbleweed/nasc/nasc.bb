SUMMARY = "Do maths like a normal person"
DESCRIPTION = "This is an application where you do calculations 'like a normal \
person'. It lets you type whatever you want, smartly figures out what \
computations are needed, and outputs an answer on the right pane. \
Then you can plug those answers in to future equations and if that \
answer changes, so does the equations it is used in."
LICENSE = "GPL-3.0-only"

PV = "0.5.4"

RPM_NAME = "nasc-0.5.4-3.8.aarch64.rpm"
RPM_HASH = "47399827f88abb03dba8b16a9902919a370d60d3d39cb4a94d32e0f278cb5d9dfe28218f168dd4b65868e2ff1cd40adbce94394b9c5d42b67e562cf34f0ccb42"

RPROVIDES:${PN} += "nasc"

RDEPENDS:${PN} += "cln \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1 \
libpango-1.0.so.0 \
libqalculate.so.23 \
libsoup-2.4.so.1 \
libstdc++.so.6 \
qalculate"

inherit rpm
