SUMMARY = "Search a string for multiple substrings at once"
DESCRIPTION = "ahocorasick_rs allows you to search for multiple substrings ('patterns') in a given string ('haystack') using variations of the Aho-Corasick algorithm. \
 \
In particular, it's implemented as a wrapper of the Rust aho-corasick library, and provides a faster alternative to the pyahocorasick library."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "python313-ahocorasick-rs-1.0.3-1.8.aarch64.rpm"
RPM_HASH = "06552a1187ee84e2b36f8af73332fb18fb6ccc930099b48c75e5d904bb5dccdf952f464d793b38c4a860c9f3aaa8951de9fbd4d5f623b48fbb015d04e1908b5a"

RPROVIDES:${PN} += "python3-ahocorasick-rs \
python3.13dist-ahocorasick-rs \
python313-ahocorasick-rs \
python3dist-ahocorasick-rs"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
