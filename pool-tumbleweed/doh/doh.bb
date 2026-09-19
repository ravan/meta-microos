SUMMARY = "Simple DoH (DNS-over-HTTPS) client"
DESCRIPTION = "A libcurl-using application that resolves a host name using \
DNS-over-HTTPS (DOH). \
This code uses POST requests unconditionally for this."
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "doh-0.1-1.22.aarch64.rpm"
RPM_HASH = "132835f1f70e5f0d9206d2e81148cfcaac997ff3474207673c83c0ff9fc78e19fb463a4cf39990c493473301db26b55912a1a9e1f1405a4ab29c0ee266ea566a"

RPROVIDES:${PN} += "doh"

RDEPENDS:${PN} += "libc.so.6 \
libcurl.so.4"

inherit rpm
