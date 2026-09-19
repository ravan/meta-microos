SUMMARY = "Development files for liblastfm6"
DESCRIPTION = "liblastfm is a collection of libraries to help you integrate Last.fm services \
into your applications. \
This package provides development files to use Last.fm services in Qt 6 \
applications."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0git.20250222T104528~81e8f9d"

RPM_NAME = "liblastfm-qt6-devel-1.2.0git.20250222T104528~81e8f9d-2.7.aarch64.rpm"
RPM_HASH = "748d39179723ef4a8db3a21ca929b461d681b83bac178464d6ed7ae807d4a5a44cb8eaba06182ddbafc54ea4df7d2da1c65d95d5d3683d12b136333e9581fa30"

RPROVIDES:${PN} += "cmake-lastfm-fingerprint6 \
cmake-lastfm6 \
liblastfm-qt6-devel"

RDEPENDS:${PN} += "liblastfm6-1"

inherit rpm
