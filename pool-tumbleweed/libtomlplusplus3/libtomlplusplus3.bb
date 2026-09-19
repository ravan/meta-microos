SUMMARY = "TOML config file parser and serializer for C++17"
DESCRIPTION = "toml++ is a TOML config parser and serializer for C++. \
 \
* Supports the TOML release v1.0.0, plus optional support for \
  some unreleased TOML features \
* Supports serialization to JSON and YAML \
* C++17 (plus some C++20 features where available, e.g. experimental \
  support for char8_t strings) \
* No requirement for RTTI and exceptions"
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "libtomlplusplus3-3.4.0-1.11.aarch64.rpm"
RPM_HASH = "0daa7dc4870a2374ce710709abc53f825cddaa3c8aa2c06c53d1640493e68ad4d8b801fea0db19376d6ce6e3fa1456bf3aafa20d81bbd6fd226483e9993ba50c"

RPROVIDES:${PN} += "libtomlplusplus.so.3 \
libtomlplusplus3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
