SUMMARY = "Fast iterable JSON parser"
DESCRIPTION = "This is a standalone version of the JSON parser used in `pydantic-core`. The recommendation is to only use this package directly if you do not use `pydantic`."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python314-jiter-0.15.0-1.3.aarch64.rpm"
RPM_HASH = "4faa9df2316c983948b8f3a5cae739f81a5410cafa9a315b55760f6d1297287da5de730b7f855c0c5c832668522d35b81781a24d86206b02dbccccb1df37392a"

RPROVIDES:${PN} += "python3.14dist-jiter \
python314-jiter \
python3dist-jiter"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
