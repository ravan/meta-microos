SUMMARY = "Source Code Highlighting C++ Library"
DESCRIPTION = "Source-highlight reads source language specifications dynamically, thus it can \
be easily extended (without recompiling the sources) for handling new \
languages. It also reads output format specifications dynamically, and thus it \
can be easily extended (without recompiling the sources) for handling new \
output formats. The syntax for these specifications is quite easy (take a look \
at the manual). \
 \
libsource-highlight is a C++ library that provides the features of \
Source-highlight."
LICENSE = "GPL-3.0-only"

PV = "3.1.9"

RPM_NAME = "libsource-highlight4-3.1.9-5.22.aarch64.rpm"
RPM_HASH = "293cf5dbf61ed5dd6d797e8885ff1218c605b64b2a36c43f3e20fce486599ec5083803f931ed3f690eaffdd01244ca272b2cfb8d6fb1de0af1eaf7b01165fd49"

RPROVIDES:${PN} += "libsource-highlight.so.4 \
libsource-highlight4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
