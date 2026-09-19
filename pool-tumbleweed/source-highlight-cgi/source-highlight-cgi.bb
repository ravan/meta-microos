SUMMARY = "Source Code Highlighting CGI"
DESCRIPTION = "Source-highlight reads source language specifications dynamically, thus it can \
be easily extended (without recompiling the sources) for handling new \
languages. It also reads output format specifications dynamically, and thus it \
can be easily extended (without recompiling the sources) for handling new \
output formats. The syntax for these specifications is quite easy (take a look \
at the manual). \
 \
This package contains a CGI that can be used to highlight source code on \
your webserver using source-highlight."
LICENSE = "GPL-3.0-only"

PV = "3.1.9"

RPM_NAME = "source-highlight-cgi-3.1.9-5.22.aarch64.rpm"
RPM_HASH = "ac142969122d84308a21daf74379750a006bbea0216fa0f39b703846222a8908b2f69d62983ff675e1a2dbf58588ad28e32c2b7bc9be5fd7992edde3a03b475b"

RPROVIDES:${PN} += "config-source-highlight-cgi \
source-highlight-cgi"

RDEPENDS:${PN} += "apache2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libsource-highlight.so.4 \
libstdc++.so.6"

inherit rpm
