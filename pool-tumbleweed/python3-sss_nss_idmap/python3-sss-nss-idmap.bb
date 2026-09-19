SUMMARY = "Python bindings for libsss_nss_idmap"
DESCRIPTION = "The libsss_nss_idmap-python contains the bindings so that \
libsss_nss_idmap can be used by Python applications."
LICENSE = "LGPL-3.0-or-later"

PV = "2.13.1"

RPM_NAME = "python3-sss_nss_idmap-2.13.1-2.1.aarch64.rpm"
RPM_HASH = "6d3f8a786c3d962fd7114197a9163573f8966dccb235290db3d6080144738eb7057c945fc0a7c3956517b80847a3a698fc765e4ebc626b29599d3d1cf3214831"

RPROVIDES:${PN} += "python3-sss-nss-idmap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsss-nss-idmap.so.0 \
python-abi \
python3"

inherit rpm
