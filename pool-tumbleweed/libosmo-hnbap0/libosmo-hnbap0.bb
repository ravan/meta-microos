SUMMARY = "Home Node B Application Part library"
DESCRIPTION = "Osmocom code for the Home Node B Application Part. HNBAP is a control protocol \
found in Home Node B networks on the Iu-h interface."
LICENSE = "AGPL-3.0-or-later"

PV = "1.8.1"

RPM_NAME = "libosmo-hnbap0-1.8.1-1.1.aarch64.rpm"
RPM_HASH = "44771676f2a07f6ee499a2e226687ec1e398bf91bf0587b4d1f3fd0c16de52f86bda1c61fa11ff34b30c9ed6a0acb60aa0c8d10e8d4ff0dbdd989c3f177541a6"

RPROVIDES:${PN} += "libosmo-hnbap.so.0 \
libosmo-hnbap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1c.so.1 \
libc.so.6 \
libosmocore.so.22 \
libtalloc.so.2"

inherit rpm
