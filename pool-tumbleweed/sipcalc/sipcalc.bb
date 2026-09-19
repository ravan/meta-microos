SUMMARY = "Console based ip subnet calculator with IPv4 and IPv6 support"
DESCRIPTION = "Sipcalc is an console based ip subnet calculator with IPv4 and IPv6 support."
LICENSE = "BSD-3-Clause"

PV = "1.1.6"

RPM_NAME = "sipcalc-1.1.6-2.34.aarch64.rpm"
RPM_HASH = "210534b6f564a1914a79a51de9eacc138151e74c6cf5be0af6f7aab47ef0a86ab307dabb6b5b100f6da7badd9b804962175b33e723cf104f3cff9383b447f3df"

RPROVIDES:${PN} += "sipcalc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
