SUMMARY = "JSON processing utility"
DESCRIPTION = "jtc stand for: JSON transformational chains (used to be JSON test console). \
 \
jtc offers a powerful way to select one or multiple elements from a source JSON \
and apply various actions on the selected elements at once (wrap selected \
elements into a new JSON, filter in/out, sort elements, update elements, insert \
new elements, remove, copy, move, compare, transform, swap around and many other \
operations)."
LICENSE = "MIT"

PV = "1.76d"

RPM_NAME = "jtc-1.76d-1.24.aarch64.rpm"
RPM_HASH = "3e71e41321e5aa50ab833ed4649bc69a87b10f472f572aed53c56499f107956d6ec5088422b1792ec006850a8b70855617021751273a1b595686064cdc343a05"

RPROVIDES:${PN} += "jtc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
