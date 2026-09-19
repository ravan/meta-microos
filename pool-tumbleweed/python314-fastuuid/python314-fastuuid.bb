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

RPM_NAME = "python314-fastuuid-0.14.0-1.4.aarch64.rpm"
RPM_HASH = "028fc9c04eda77c57473ce85ba33be35072ca246654d9a3dbe6fe3debddce84b659ee434f185730bc3929f97c686a7a64903b066818f8ab14379b1193746d6f4"

RPROVIDES:${PN} += "python3.14dist-fastuuid \
python314-fastuuid \
python3dist-fastuuid"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
