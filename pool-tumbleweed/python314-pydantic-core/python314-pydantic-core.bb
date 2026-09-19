SUMMARY = "Core functionality for pydantic validation and serialization"
DESCRIPTION = "This package provides the core functionality for \
[pydantic](https://docs.pydantic.dev) validation and serialization. \
 \
Pydantic-core is currently around 17x faster than pydantic V1."
LICENSE = "MIT"

PV = "2.46.5"

RPM_NAME = "python314-pydantic-core-2.46.5-1.1.aarch64.rpm"
RPM_HASH = "9c9033b76a92288ef9a48255a160c1cd7df52f4043460058aeb81efd0c6f32f71400092c3914a4b0489b64167d9fe40a91977648a274b3eb0b177fbe278e89e7"

RPROVIDES:${PN} += "python3.14dist-pydantic-core \
python314-pydantic-core \
python3dist-pydantic-core"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python314-typing-extensions"

inherit rpm
