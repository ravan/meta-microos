SUMMARY = "A tool for manipulating Java symbols"
DESCRIPTION = "The tool can be used for patching .java sources in cases where using sed is \
insufficient due to Java language syntax. The tool follows Java language rules \
rather than applying simple regular expressions on the source code."
LICENSE = "Apache-2.0"

PV = "1.3.3"

RPM_NAME = "jurand-1.3.3-1.9.aarch64.rpm"
RPM_HASH = "baaf1f3b7e0d2b2fc6d8ee1fd5bd9cec30d3c5c2583bbd13e48bced5b3dd40aae44433dd9df110e7219f3311b099fa6934b18cdbb4dba1840578ffaa25cd269d"

RPROVIDES:${PN} += "jurand \
rpm-macro-java-remove-annotations \
rpm-macro-java-remove-imports"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
