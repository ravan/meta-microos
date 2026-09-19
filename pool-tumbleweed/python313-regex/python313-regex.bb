SUMMARY = "Alternative regular expression module for Python"
DESCRIPTION = "An alternate regex implementation. It differs from 're' in that \
 \
* Zero-width matches are handled like in Perl and PCRE: \
  * ``.split`` will split a string at a zero-width match. \
  * ``.sub`` will handle zero-width matches correctly. \
* Inline flags apply to the end of the group or pattern, and they can \
  be turned off. \
* Nested sets and set operations are supported. \
* Case-insensitive matches in Unicode use full case-folding by \
  default."
LICENSE = "Apache-2.0"

PV = "2026.7.19"

RPM_NAME = "python313-regex-2026.7.19-1.1.aarch64.rpm"
RPM_HASH = "8c5244f1bf99b315561942783719a532580888354d4a385457c2ddace11b60493898ef68056fc103ed4cc14f786e2d721cd02da13fff1004f64df041e6fae806"

RPROVIDES:${PN} += "python3-regex \
python3.13dist-regex \
python313-regex \
python3dist-regex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
