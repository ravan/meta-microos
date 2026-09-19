SUMMARY = "GJS runtime loader for libpeas"
DESCRIPTION = "libpeas is a gobject-based plugin engine, and is targetted at giving \
every application the chance to assume its own extensibility. \
 \
This package contains the GJS loader."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.1"

RPM_NAME = "libpeas2-loader-gjs-2.2.1-2.4.aarch64.rpm"
RPM_HASH = "56359996586b7a81a588c7381f432ea45e6996dbae035311ab88f123fd08218bd6edfdf5337d38502dfb5466154bfa6974e6a2d8c86e0dab541cef103d22617d"

RPROVIDES:${PN} += "libgjsloader.so \
libpeas2-loader-gjs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgjs.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmozjs-140.so.0 \
libpeas-2.so.0 \
libstdc++.so.6"

inherit rpm
