SUMMARY = "Development files for libtexpdf"
DESCRIPTION = "A PDF library extracted from TeX's dvipdfmx. Used in software such as SILE. \
This package contains the development files for libtexpdf."
LICENSE = "GPL-2.0-or-later"

PV = "0.15.13"

RPM_NAME = "libtexpdf-devel-0.15.13-2.7.aarch64.rpm"
RPM_HASH = "17a79c912338168c5f433b02dc4a5a6d9fdebffd22c908ef5f76b31f0ae6105ff65ce9af5d00de2e3c6c43a1676d0b61f21315ad9e61924bf82be46300089e11"

RPROVIDES:${PN} += "libtexpdf-devel"

RDEPENDS:${PN} += "/sbin/ldconfig \
libtexpdf0"

inherit rpm
