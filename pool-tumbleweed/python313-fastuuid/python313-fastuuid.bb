SUMMARY = "Python bindings to Rust's UUID library"
DESCRIPTION = "FastUUID is a library which provides CPython bindings to Rust's UUID library. \
Why? \
It is much faster than Python's pure-python implementation and it is stricter \
when parsing hexadecimal representation of UUIDs. \
If you need to generate a lot of random UUIDs we also provide the uuid4_bulk() \
function which releases the GIL for the entire duration of the generation. This \
allows other threads to run while the library generates UUIDs."
LICENSE = "BSD-3-Clause"

PV = "0.14.0"

RPM_NAME = "python313-fastuuid-0.14.0-1.4.aarch64.rpm"
RPM_HASH = "92408403a0e2f99e088105573c0e957307f00b0042c2425207549882267dfe9aa909f9d8dc0762a67b368b1e3d58a1f02b4456921cf4a91d17babfa538614e31"

RPROVIDES:${PN} += "python3-fastuuid \
python3.13dist-fastuuid \
python313-fastuuid \
python3dist-fastuuid"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
