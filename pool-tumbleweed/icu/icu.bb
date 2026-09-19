SUMMARY = "International Components for Unicode"
DESCRIPTION = "ICU is a set of C and C++ libraries that provide extensive Unicode and locale \
support, such as calendar, conversions for many character sets, language \
sensitive collation, date and time formatting, support for many locales, \
message catalogs and resources, message formatting, normalization, number and \
currency formatting, time zone support, transliteration, and word, line, and \
sentence breaking. \
 \
This subpackage contains the runtime programs for interacting with ICU."
LICENSE = "Unicode-3.0"

PV = "78.3"

RPM_NAME = "icu-78.3-1.3.aarch64.rpm"
RPM_HASH = "7fa8ce97ce12d4cd8abc818472aae7ebad894b61f4f554ece23be260afdd23329f9c4906f837a31d2eb6734005267a40b9dc9fe5f500f68ae8b1bc5fc3bb792b"

RPROVIDES:${PN} += "bundled-timezone \
icu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
libicuio.so.78 \
libicutu.so.78 \
libicuuc.so.78 \
libstdc++.so.6"

inherit rpm
