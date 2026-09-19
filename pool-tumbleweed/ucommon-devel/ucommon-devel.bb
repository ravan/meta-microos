SUMMARY = "Headers for building ucommon applications"
DESCRIPTION = "This package provides header and support files needed for building \
applications that use the uCommon library and frameworks."
LICENSE = "LGPL-3.0-or-later"

PV = "7.0.1"

RPM_NAME = "ucommon-devel-7.0.1-2.11.aarch64.rpm"
RPM_HASH = "6b27c069e1be309f27033438ef8cbc1b795911ed275bd20e15946955a2069675a9db0a0ddf0e41e1a39aee36a445533d25b480a800548da7e38e8ef65ed0b818"

RPROVIDES:${PN} += "pkgconfig-commoncpp \
pkgconfig-ucommon \
ucommon-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libucommon8 \
pkgconfig-libcrypto \
pkgconfig-libssl"

inherit rpm
