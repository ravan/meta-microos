SUMMARY = "Kerberos high-level interface"
DESCRIPTION = "A high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps \
the entire Kerberos.framework, and instead offer a limited set of \
functions that do what is needed for client/server Kerberos \
authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python313-kerberos-1.3.1-3.7.aarch64.rpm"
RPM_HASH = "d24118332321299ddca29a418404a55b71b303ae0949b27afb74ee6615b6f7e7707a34c42527fe9ad4488f9eb5a47b88b11acfe66d2ca2c8dd4d0d37a4ea9d12"

RPROVIDES:${PN} += "python3-kerberos \
python3.13dist-kerberos \
python313-kerberos \
python3dist-kerberos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
python-abi"

inherit rpm
