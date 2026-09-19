SUMMARY = "Development files of libwxlua"
DESCRIPTION = "This package contains files to be used in your C++ programs to embed a Lua \
interpreter with the wxWidgets API."
LICENSE = "GPL-2.0-or-later-with-WxWindows-exception-3.1"

PV = "3.1.0.0+42"

RPM_NAME = "wxlua-devel-3.1.0.0+42-3.4.aarch64.rpm"
RPM_HASH = "e69d27349f9a7b676b762c536c5ec5e42a466b0e4c8a8f11a0c610c51331ea73c957b19450aa9943e9cc78e8856668107feac45d3f03bbfc30509d6011760caa"

RPROVIDES:${PN} += "wxlua-devel"

RDEPENDS:${PN} += "libwxlua"

inherit rpm
