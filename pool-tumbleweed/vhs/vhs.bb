SUMMARY = "CLI video recorder"
DESCRIPTION = "VHS records your terminal as videos or gifs for demos."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "vhs-0.9.0-1.19.aarch64.rpm"
RPM_HASH = "d031ea9d81bce5060dd642ca529201d34e2069a774674551e17ac9243cf489eca546d8596c7b138022aaad44af8f43cd2af86e0d7cf9173c2b6f42a9881aadaf"

RPROVIDES:${PN} += "vhs"

RDEPENDS:${PN} += "ffmpeg \
libc.so.6 \
ttyd"

inherit rpm
