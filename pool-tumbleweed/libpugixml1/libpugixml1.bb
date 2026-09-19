SUMMARY = "Light-weight C++ XML Processing Library"
DESCRIPTION = "pugixml is a light-weight C++ XML processing library. It features: \
 \
- DOM-like interface with rich traversal/modification capabilities \
- Extremely fast non-validating XML parser which constructs the DOM tree from \
  an XML file/buffer \
- XPath 1.0 implementation for complex data-driven tree queries \
- Full Unicode support with Unicode interface variants and automatic encoding \
  conversions"
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libpugixml1-1.16-1.2.aarch64.rpm"
RPM_HASH = "a3a3774ced0c3d9a2eea5d589cdf35907d20cfd2815116d5c152d5cf26db574d70d9bf0a135213069ab073d02feedc5e1fbd80f4a9a85ce346ed807e4e6d9934"

RPROVIDES:${PN} += "libpugixml.so.1 \
libpugixml1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
