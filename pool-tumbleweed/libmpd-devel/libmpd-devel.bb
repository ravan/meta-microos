SUMMARY = "Development Files for libmpd"
DESCRIPTION = "This package provides the API documentation and development files needed to \
develop applications based on libmpd."
LICENSE = "GPL-2.0+"

PV = "11.8.17"

RPM_NAME = "libmpd-devel-11.8.17-3.10.aarch64.rpm"
RPM_HASH = "fff54d482b8d3637abf7b7f19ab15f938ab8d1b3c734ce988fb975c391aa4cff52d4deb44798cb0e5760c72859586f3665d47d453aa5ec487353b1706a4a6cc8"

RPROVIDES:${PN} += "libmpd-devel \
pkgconfig-libmpd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmpd1 \
pkgconfig-glib-2.0"

inherit rpm
