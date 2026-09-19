SUMMARY = "The uv build backend"
DESCRIPTION = "This package is a slimmed down version of uv containing only the build backend."
LICENSE = "MIT"

PV = "0.11.7"

RPM_NAME = "python314-uv-build-0.11.7-1.4.aarch64.rpm"
RPM_HASH = "4ae959e621c65a885d143f8e4d1577132a509d51fb63d6e45cbb2f8b3ac34e31abfb839c8ecc59fdc562fe5a8e393b62e719b35fe0a1bd472bdc6db9868d0042"

RPROVIDES:${PN} += "python3.14dist-uv-build \
python314-uv-build \
python3dist-uv-build"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
