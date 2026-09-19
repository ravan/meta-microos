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

RPM_NAME = "libsource-highlight-devel-3.1.9-5.22.aarch64.rpm"
RPM_HASH = "755c9390ae5f4cad55d671661fd1fdb056aaa3e699ecc2eceb960fec7dd1c72d36cc7da83fa2265a05a817a4e84c06348be54595c6a11d4e503d5718f9df3369"

RPROVIDES:${PN} += "libsource-highlight-devel \
pkgconfig-source-highlight"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libsource-highlight4"

inherit rpm
