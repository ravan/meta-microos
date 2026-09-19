SUMMARY = "Controller for Logitech LED keyboards"
DESCRIPTION = "Linux controller for Logitech Led Keyboards. \
Compatible keyboards: \
  G213 Prodigy \
  G410 Atlas Spectrum \
  G413 Carbon \
  G512 Carbon \
  G513 Carbon \
  G610 Orion (Brown and Red) \
  G810 Orion Spectrum \
  G910 Orion (Spark and Spectrum) \
  GPRO"
LICENSE = "GPL-3.0-only"

PV = "0.4.3"

RPM_NAME = "g810-led-0.4.3-3.9.aarch64.rpm"
RPM_HASH = "280f5f553d1c3f1f003e58328225e01ca8fd48d34265924d9d538dabfcd693b64ee00a0533e69593d208b184356983ece8a5ddb739f3db9c6edc6c0dc568ae7b"

RPROVIDES:${PN} += "config-g810-led \
g810-led"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libhidapi-hidraw.so.0 \
libstdc++.so.6 \
systemd"

inherit rpm
