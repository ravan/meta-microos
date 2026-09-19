SUMMARY = "Development files for librcc, a charset conversion library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of librcc."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "librcc-devel-0.2.13-3.6.aarch64.rpm"
RPM_HASH = "5de7320d6e94d77f9edcc76af560c59acc9be55897f541b922f766545629573a05f2a76a8837e584fc2297ccadf093da092d9cf3b2bf0a35842f389d3a0f8e56"

RPROVIDES:${PN} += "librcc-devel \
pkgconfig-librcc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librcc0 \
pkgconfig-libxml-2.0"

inherit rpm
