SUMMARY = "Library for Colour ASCII Art, text mode graphics"
DESCRIPTION = "This package contains the header files and static libraries needed to \
compile applications or shared objects that use libcaca."
LICENSE = "WTFPL"

PV = "0.99.beta20+git.1776622070.7c8e333"

RPM_NAME = "libcaca-devel-0.99.beta20+git.1776622070.7c8e333-2.3.aarch64.rpm"
RPM_HASH = "de8099e3be88cb92e5476f4c07d3b3d1bee3377beac6374ef0519fa25ea2e005dd08c7df4d78e64f62687fc1812aab1fbbf0cc09caad0645a513339f16adf3f4"

RPROVIDES:${PN} += "libcaca-devel \
pkgconfig-caca \
pkgconfig-caca++"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libcaca \
libcaca0-plugins"

inherit rpm
