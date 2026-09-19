SUMMARY = "Libyui - tools for the NCurses (text based) user interface"
DESCRIPTION = "This package contains tools for the NCurses (text based) \
user interface component for libyui: \
 \
libyui-terminal - useful for testing on headless machines"
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.7.7"

RPM_NAME = "libyui-ncurses-tools-4.7.7-1.2.aarch64.rpm"
RPM_HASH = "30b01157c992d0a7a6b2bf30dcb83554fa919981faa78db51fb925ddb5dcf578b17c63cdd561170bad9eea4889a961ab903aa66e43ffaf425a71b5ae487a8240"

RPROVIDES:${PN} += "libyui-ncurses-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
screen"

inherit rpm
