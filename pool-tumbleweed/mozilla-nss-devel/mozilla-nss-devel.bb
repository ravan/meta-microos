SUMMARY = "Network (Netscape) Security Services development files"
DESCRIPTION = "Network Security Services (NSS) is a set of libraries designed to \
support cross-platform development of security-enabled server \
applications. Applications built with NSS can support SSL v3, \
TLS v1.0, v1.1, v1.2, PKCS #5, PKCS #7, PKCS #11, PKCS #12, S/MIME, X.509 v3 \
certificates, and other security standards."
LICENSE = "MPL-2.0"

PV = "3.127"

RPM_NAME = "mozilla-nss-devel-3.127-1.1.aarch64.rpm"
RPM_HASH = "a78da5a417e0d9620472807d394fac5e03fa01e5f88a172d6c0d50a154f33e757818900564cd8337cc3a580016c4005845223f5598e7d9c79d5484c8cfd4e398"

RPROVIDES:${PN} += "mozilla-nss-devel \
pkgconfig-nss \
pkgconfig-nss-util"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libfreebl3 \
libsoftokn3 \
mozilla-nss \
pkgconfig-nspr \
pkgconfig-nss-util"

inherit rpm
