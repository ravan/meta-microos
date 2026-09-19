SUMMARY = "CA certificates for NSS"
DESCRIPTION = "This package contains the integrated CA root certificates from the \
Mozilla project."
LICENSE = "MPL-2.0"

PV = "3.127"

RPM_NAME = "mozilla-nss-certs-3.127-1.1.aarch64.rpm"
RPM_HASH = "ea8384152abc0266b8501ca612283e7226a758c552ceda8123e3ba2419f4d7de7032224e4af0a6f0934505c910f44b264dc0a2711da361b95b84c0b37dab9937"

RPROVIDES:${PN} += "libnssckbi.so \
mozilla-nss-certs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnspr4.so \
libplc4.so \
libplds4.so"

inherit rpm
