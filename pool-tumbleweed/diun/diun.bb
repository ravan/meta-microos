SUMMARY = "Receive notifications when an image is updated on a Docker registry"
DESCRIPTION = "Diun is a CLI application written in Go to receive notifications when a Docker \
image is updated on a Docker registry."
LICENSE = "MIT"

PV = "4.33.0"

RPM_NAME = "diun-4.33.0-1.4.aarch64.rpm"
RPM_HASH = "99380e9d21df25cd936b2c586a7139a6567c7cb90bb864a4081c9e006a7a313c48aa93d32fbc8eb9cc9c71b938f592145e766af2f791170b0828283aad93fb30"

RPROVIDES:${PN} += "diun \
group-diun \
user-diun"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
sysuser-shadow"

inherit rpm
