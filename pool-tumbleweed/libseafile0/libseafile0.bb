SUMMARY = "Library files for seafile"
DESCRIPTION = "The libseafile0 package contains libraries and header files for \
developing applications that use seafile."
LICENSE = "GPL-2.0-only"

PV = "9.0.21"

RPM_NAME = "libseafile0-9.0.21-1.1.aarch64.rpm"
RPM_HASH = "82f825ffab9af42914435a4efa555d195e039927dc59e144d811d42e3f2601303bb964a9da9550c113013249cb162c537aeaa9e5d4ff619270f765f1de65f1e5"

RPROVIDES:${PN} += "libseafile.so.0 \
libseafile0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsearpc.so.1"

inherit rpm
