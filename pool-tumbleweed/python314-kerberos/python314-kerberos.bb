SUMMARY = "Kerberos high-level interface"
DESCRIPTION = "A high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps \
the entire Kerberos.framework, and instead offer a limited set of \
functions that do what is needed for client/server Kerberos \
authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "python314-kerberos-1.3.1-3.7.aarch64.rpm"
RPM_HASH = "2a066af21cf30e8e09737c1e7900a5d3223968cd3503a87a89f113397bffc333cb86ca9295843be9b757bf1b4f4895e6fd3247cef909ebc40b1ed829f5a08bf9"

RPROVIDES:${PN} += "python3.14dist-kerberos \
python314-kerberos \
python3dist-kerberos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
python-abi"

inherit rpm
