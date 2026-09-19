SUMMARY = "Development files for the oneAPI Unified Runtime"
DESCRIPTION = "oneAPI Unified Runtime (UR) provides a unified interface to device \
agnostic runtimes such as DPC++. \
 \
This package contains the development files for the oneAPI Unified Runtime."
LICENSE = "Apache-2.0"

PV = "0.11.10"

RPM_NAME = "unified-runtime-devel-0.11.10-2.1.aarch64.rpm"
RPM_HASH = "df66902c0ad2bbf965fc12367e611b7f10dab19d084140b635345ff1f846f9d8f3a69367407ef83614112fc5314bf0aeadce79a0a5521512c9da6ba99c8b1f67"

RPROVIDES:${PN} += "cmake-unified-runtime \
pkgconfig-libur-loader \
unified-runtime-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig \
unified-memory-framework-devel"

inherit rpm
