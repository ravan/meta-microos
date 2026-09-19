SUMMARY = "Backport of compressionzstd"
DESCRIPTION = "Backport of compression.zstd"
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "python313-backports.zstd-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "6b63a5c473969541525eca05e80840a994eedbc6eb373d3211a43096c7d7a1c25951ae7839e5ea0202a9d67bad39e6a93445ae2afc144c7024e6e0ceb1c0dfc5"

RPROVIDES:${PN} += "python3-backports.zstd \
python3.13dist-backports.zstd \
python313-backports.zstd \
python3dist-backports.zstd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
