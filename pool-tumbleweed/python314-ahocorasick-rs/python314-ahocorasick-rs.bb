SUMMARY = "Search a string for multiple substrings at once"
DESCRIPTION = "ahocorasick_rs allows you to search for multiple substrings ('patterns') in a given string ('haystack') using variations of the Aho-Corasick algorithm. \
 \
In particular, it's implemented as a wrapper of the Rust aho-corasick library, and provides a faster alternative to the pyahocorasick library."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "python314-ahocorasick-rs-1.0.3-1.8.aarch64.rpm"
RPM_HASH = "68472ae3c7194af00f6ebe87b2e00dc26bd20a90efcf5147efffe673803ee0b8bac1b3f91381201f8bff66d355d580fcdb300b2baf17b70081a0dc1bdd693323"

RPROVIDES:${PN} += "python3.14dist-ahocorasick-rs \
python314-ahocorasick-rs \
python3dist-ahocorasick-rs"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
