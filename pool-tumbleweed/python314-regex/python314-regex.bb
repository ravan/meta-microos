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

RPM_NAME = "python314-regex-2026.7.19-1.1.aarch64.rpm"
RPM_HASH = "fa0c33b955a0f082fd7b44ce3f11a2b0a88dc0745c3f9f9f66841fd61dc7e0a2dda4c46bb0400365184f8d225ad92e0d73c1d9674869f2e79831971d0bec4050"

RPROVIDES:${PN} += "python3.14dist-regex \
python314-regex \
python3dist-regex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
