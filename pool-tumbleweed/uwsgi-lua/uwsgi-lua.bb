SUMMARY = "Lua Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for Lua applications via the wsapi interface."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "uwsgi-lua-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "92768e64a84ded1e4bcd07fc5bce7c5852fcdd16c7773a64c2388e1936ec39878d5523d905babed6447d0e79037a66e6315a49f5c604faa95432dae273f49c0c"

RPROVIDES:${PN} += "uwsgi-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
uwsgi"

inherit rpm
