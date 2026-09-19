SUMMARY = "Python3 dependencies of samba-libs"
DESCRIPTION = "Dependencies of samba-libs that require python3."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "samba-libs-python3-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "db0eff77505b50e5c1f3dda9c91a876f6e55cfd47ecba4c336d2103a8fdaf50c8678eca42d8d3a625d08ce1e9bf747f3ac257813dc831b469fcadaae1c408c5b"

RPROVIDES:${PN} += "libsamba-net-join.cpython-313-aarch64-linux-gnu-private-samba.so \
libsamba-python.cpython-313-aarch64-linux-gnu-private-samba.so \
samba-libs-python3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libMESSAGING-private-samba.so \
libc.so.6 \
libdcerpc-binding.so.0 \
libdcerpc-samba-private-samba.so \
libdcerpc.so.0 \
libevents-private-samba.so \
libgenrand-private-samba.so \
libldb.so.2 \
libldbsamba-private-samba.so \
libndr-samba-private-samba.so \
libndr-standard.so.0 \
libndr.so.6 \
libpyldb-util.cpython-313-aarch64-linux-gnu-private-samba.so \
libpytalloc-util.cpython-313-aarch64-linux-gnu.so.2 \
libpython3.13.so.1.0 \
libsamba-credentials.so.1 \
libsamba-debug-private-samba.so \
libsamba-errors.so.1 \
libsamba-hostconfig.so.0 \
libsamba-net-private-samba.so \
libsamba-security-private-samba.so \
libsamba-util.so.0 \
libsamdb-common-private-samba.so \
libsamdb.so.0 \
libserver-role-private-samba.so \
libtalloc.so.2 \
python3"

inherit rpm
