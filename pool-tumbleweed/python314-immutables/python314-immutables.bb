SUMMARY = "Immutable collections for Python"
DESCRIPTION = "Immutable collections for Python."
LICENSE = "Apache-2.0"

PV = "0.21"

RPM_NAME = "python314-immutables-0.21-2.7.aarch64.rpm"
RPM_HASH = "027caf6f197d93fdc1d531227e66b6b1c262401b210db5f5b77fb8bd41f0d297dd7ed310ff4476898495dd90f60bcf12c833fb332d285e5540860caceece3e42"

RPROVIDES:${PN} += "python3.14dist-immutables \
python314-immutables \
python3dist-immutables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
