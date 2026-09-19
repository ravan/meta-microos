SUMMARY = "Development Files for the Last.fm Webservices"
DESCRIPTION = "liblastfm is a collection of libraries to help you integrate Last.fm services \
into your rich desktop software. It is officially supported software developed \
by Last.fm staff. \
 \
This package contains development files for liblastfm."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.0"

RPM_NAME = "liblastfm-qt5-devel-1.1.0-2.7.aarch64.rpm"
RPM_HASH = "e41ac83f1d83a5f00b9dca560a4592e723e2b9b1e7543278b79d55312a07d923071bbc1092bd5468d5c6c72322f24403ae38d17e67f0b73d0bc891b3db6bc42c"

RPROVIDES:${PN} += "liblastfm-qt5-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5DBus \
cmake-Qt5Network \
cmake-Qt5Xml \
liblastfm-fingerprint5-1 \
liblastfm5-1"

inherit rpm
