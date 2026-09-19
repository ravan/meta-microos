SUMMARY = "Adaptor to make NSS read the p11-kit trust store"
DESCRIPTION = "Adaptor library to make NSS read the p11-kit trust store. It has \
to be installed intead of mozilla-nss-certs."
LICENSE = "BSD-3-Clause"

PV = "0.26.2"

RPM_NAME = "p11-kit-nss-trust-0.26.2-1.6.aarch64.rpm"
RPM_HASH = "f9d7c459dca3c687b0ed50e7e614d5c99a119088fcb3aaf711d65fe6c528dfa75cee4587a318d824f60ae66c8c85db0d9b3213166791b18617e8c424bf85678a"

RPROVIDES:${PN} += "libnssckbi.so \
p11-kit-nss-trust"

RDEPENDS:${PN} += "p11-kit"

inherit rpm
