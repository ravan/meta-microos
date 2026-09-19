SUMMARY = "Ammonia HTML sanitizer Python binding"
DESCRIPTION = "Ammonia HTML sanitizer Python binding"
LICENSE = "MIT"

PV = "0.3.6"

RPM_NAME = "python313-nh3-0.3.6-1.4.aarch64.rpm"
RPM_HASH = "0340adbc1ba89d3ba1ede020ee631f417c36733ba721d4416c436b59cfc1f73bc4bf49c3ef267f673020ac8c5bfac7d6e6ee1631c80bf6d484405e9a51d3c8ec"

RPROVIDES:${PN} += "python3-nh3 \
python3.13dist-nh3 \
python313-nh3 \
python3dist-nh3"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
