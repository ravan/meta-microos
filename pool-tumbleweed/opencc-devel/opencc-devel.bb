SUMMARY = "Open Chinese Convert"
DESCRIPTION = "OpenCC is an opensource project for conversion between Traditional \
Chinese and Simplified Chinese, which supports phrase-level conversion \
and regional idioms among Mainland China, Taiwan and Hong kong. \
 \
This package provides development headers for OpenCC."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "opencc-devel-1.2.0-1.8.aarch64.rpm"
RPM_HASH = "cd82a83d4488286ff8443dd5f10b893b535eaa00a277e8231e85d87e2877f494ec750645e0aa26dacc8574c7d6e19b74f869fc63a421464269616a80b62c8e30"

RPROVIDES:${PN} += "cmake-OpenCC \
opencc-devel \
pkgconfig-opencc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
opencc"

inherit rpm
