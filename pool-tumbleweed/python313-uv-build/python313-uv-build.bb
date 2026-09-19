SUMMARY = "The uv build backend"
DESCRIPTION = "This package is a slimmed down version of uv containing only the build backend."
LICENSE = "MIT"

PV = "0.11.7"

RPM_NAME = "python313-uv-build-0.11.7-1.4.aarch64.rpm"
RPM_HASH = "1e9ea3fa6085d5e2a6e9f44a59d076ae0791f355cd45b89096c6e8f4ecc9160bd8ae99c8ef510cdee5a8ec2c49a4de40a06d44b4505422ccb3ff942c3e5f1bd6"

RPROVIDES:${PN} += "python3-uv-build \
python3.13dist-uv-build \
python313-uv-build \
python3dist-uv-build"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
