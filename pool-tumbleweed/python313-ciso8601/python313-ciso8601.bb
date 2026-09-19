SUMMARY = "Fast ISO8601 date time parser for Python written in C"
DESCRIPTION = "Fast ISO8601 date time parser for Python written in C"
LICENSE = "MIT"

PV = "2.3.3"

RPM_NAME = "python313-ciso8601-2.3.3-1.7.aarch64.rpm"
RPM_HASH = "2a397475bc9d4f3911ea06cc11e3b90c5fb06a69860bfaf5d3bd15facca5db610d86128d6e0f8cb8ea9259a20639b09758bc2311520e2503fbea488cd45b9333"

RPROVIDES:${PN} += "python3-ciso8601 \
python3.13dist-ciso8601 \
python313-ciso8601 \
python3dist-ciso8601"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
