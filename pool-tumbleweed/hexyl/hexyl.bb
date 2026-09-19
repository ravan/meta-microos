SUMMARY = "A command-line hex viewer"
DESCRIPTION = "hexyl is a simple hex viewer for the terminal. It uses a colored output \
to distinguish different categories of bytes (NUL bytes, printable \
ASCII characters, ASCII whitespace characters, other ASCII characters \
and non-ASCII)."
LICENSE = "Apache-2.0 | MIT"

PV = "0.17.0"

RPM_NAME = "hexyl-0.17.0-1.5.aarch64.rpm"
RPM_HASH = "eb0b6ab7c4e2c4cd95f9d19a93e30c5676c2ffa51549ca6d3116bfb83a8226c5ddb7b2e4d3446b717f793bbe807d4c39d253558616fdacc57d881e5efc206e25"

RPROVIDES:${PN} += "hexyl"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1"

inherit rpm
