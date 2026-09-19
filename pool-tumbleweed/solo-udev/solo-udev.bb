SUMMARY = "Udev rules for Solo and Solo Tap security keys"
DESCRIPTION = "This package contains the udev rule file for the Solo and Solo Tap security keys. \
These are required if local non-root users are supposed to be able to use the keys."
LICENSE = "Apache-2.0 | MIT"

PV = "4.1.2"

RPM_NAME = "solo-udev-4.1.2-1.14.noarch.rpm"
RPM_HASH = "d986fdaf65baa9a1c36b46ea7b368d796ebed5c3fdf27da1d3e88ee0856ca0124a6d0da474aa90f4550c90ee414ad5595635d78cba7cbfabd510bda0826f3758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "solo-udev"

RDEPENDS:${PN} += "udev"

inherit rpm
