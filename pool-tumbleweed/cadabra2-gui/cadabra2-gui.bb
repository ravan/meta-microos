SUMMARY = "GUI for cadabra2: computer algebra system for problems in field theory"
DESCRIPTION = "Cadabra2 is a computer algebra system (CAS) designed specifically for \
the solution of problems encountered in field theory. \
 \
This package provides the GUI for cadabra2 and it's desktop menu integration."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.14"

RPM_NAME = "cadabra2-gui-2.5.14-3.1.aarch64.rpm"
RPM_HASH = "b3904c302716a23d2bd2d821626ab1be86bf54e28ca5b16e04e5ce25d86a19bac9356962949984c26c729457e3df24631325e97da03bb7eac37ddd5e0de75c54"

RPROVIDES:${PN} += "cadabra \
cadabra2-gui"

RDEPENDS:${PN} += "cadabra2 \
ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libcairo.so.2 \
libcairomm-1.0.so.1 \
libcrypto.so.3 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgdkmm-3.0.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtkmm-3.0.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangomm-1.4.so.1 \
libpython3.13.so.1.0 \
libsigc-2.0.so.0 \
libsqlite3.so.0 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
