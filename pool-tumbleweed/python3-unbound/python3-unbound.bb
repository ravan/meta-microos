SUMMARY = "Python modules and extensions for unbound"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the Python modules and extensions for unbound."
LICENSE = "BSD-3-Clause"

PV = "1.26.0"

RPM_NAME = "python3-unbound-1.26.0-2.1.aarch64.rpm"
RPM_HASH = "7a9933056d39f415fd2946d15437649c2076317d88af0e2778563339cc35c011f456f81340f4556018892104ce41e3f622af8a2d6ce2f93d092650554387fc9e"

RPROVIDES:${PN} += "python3-unbound \
unbound-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
libunbound.so.8 \
libunbound8 \
python-abi"

inherit rpm
