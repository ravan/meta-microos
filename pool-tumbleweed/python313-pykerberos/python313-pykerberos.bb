SUMMARY = "High-level interface to Kerberos"
DESCRIPTION = "This Python package is a high-level wrapper for Kerberos (GSSAPI) operations. \
The goal is to avoid having to build a module that wraps the entire Kerberos.framework, \
and instead offer a limited set of functions that do what is needed for client/server \
Kerberos authentication based on <http://www.ietf.org/rfc/rfc4559.txt>."
LICENSE = "Apache-2.0"

PV = "1.2.4"

RPM_NAME = "python313-pykerberos-1.2.4-2.7.aarch64.rpm"
RPM_HASH = "8b96a338c6255deb485aabfd64423fb08c5d04ed343c4f385e25ff8ffa5daee2786138abd88b7513650b86cc105aacf98d5ce9750a2d8960f0bb9117929ee861"

RPROVIDES:${PN} += "python3-pykerberos \
python3.13dist-pykerberos \
python313-pykerberos \
python3dist-pykerberos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libgssapi-krb5.so.2 \
libkrb5.so.3 \
python-abi"

inherit rpm
