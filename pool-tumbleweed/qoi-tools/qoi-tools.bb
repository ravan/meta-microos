SUMMARY = "A tools for QOI"
DESCRIPTION = "A tools for fast, lossless image compression using the 'Quite OK Image \
Format'."
LICENSE = "MIT"

PV = "0~20250212"

RPM_NAME = "qoi-tools-0~20250212-1.7.aarch64.rpm"
RPM_HASH = "68dd1341cdff895523d65ec0d98664f32cc4e302c0ac799869796915a0f5942729cdbbac73e26b1f7314313a2dcd5ad561fa30d808788a5973f45ad59f09c98b"

RPROVIDES:${PN} += "qoi-tools"

RDEPENDS:${PN} += "libc.so.6 \
libpng16.so.16"

inherit rpm
