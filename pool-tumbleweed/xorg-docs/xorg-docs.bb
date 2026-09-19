SUMMARY = "Miscellaneous documentation for the X Window System"
DESCRIPTION = "This package provides miscellaneous documentation for the X Window \
System that doesn't better fit into other packages."
LICENSE = "MIT"

PV = "1.7.3"

RPM_NAME = "xorg-docs-1.7.3-1.7.noarch.rpm"
RPM_HASH = "c626e0ff15312b56eaf489b18d25dbd0c9cb09a9b12174c39321c901bf3192bd850aa1cc6d5e4c787e7377fcf676e12cbc68e580a40488e99f44b19c72df0c8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-docs \
xorg-x11-doc"

RDEPENDS:${PN} += ""

inherit rpm
