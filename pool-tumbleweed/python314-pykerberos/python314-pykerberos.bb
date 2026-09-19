SUMMARY = "High-level interface to Kerberos"
DESCRIPTION = "This Python package is a high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps the entire Kerberos.framework, \
and instead offer a limited set of functions that do what is needed for client/server \
Kerberos authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.2.4"

RPM_NAME = "python314-pykerberos-1.2.4-2.7.aarch64.rpm"
RPM_HASH = "450c904a20ef7bb0df94bfe31f9a000743267a9c4a030f501082df0acaae556f443532945b7d725702788d1fd4fc579c48bd15678aa20580e9ae67b4a1f2b184"

RPROVIDES:${PN} += "python3.14dist-pykerberos \
python314-pykerberos \
python3dist-pykerberos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
python-abi"

inherit rpm
