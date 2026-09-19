SUMMARY = "Core functionality for pydantic validation and serialization"
DESCRIPTION = "This package provides the core functionality for \
[pydantic](https://docs.pydantic.dev) validation and serialization. \
 \
Pydantic-core is currently around 17x faster than pydantic V1."
LICENSE = "MIT"

PV = "2.46.5"

RPM_NAME = "python313-pydantic-core-2.46.5-1.1.aarch64.rpm"
RPM_HASH = "2ec004997b755a2541cb3f437858b175001fd06de3748a9c8eb13dd756a74761f799ea594223a2484726c55f3ba24b556b59c3d846ef2135200d65ab74f7436f"

RPROVIDES:${PN} += "python3-pydantic-core \
python3.13dist-pydantic-core \
python313-pydantic-core \
python3dist-pydantic-core"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python313-typing-extensions"

inherit rpm
