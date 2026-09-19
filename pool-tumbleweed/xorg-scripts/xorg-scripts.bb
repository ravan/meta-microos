SUMMARY = "Miscellaneous scripts for X"
DESCRIPTION = "This package contains miscellaneous scripts for X, like xon, a script \
to start an X program on a remote machine."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "xorg-scripts-1.0.1-11.7.noarch.rpm"
RPM_HASH = "9f6e88dcfb87d37ac6a0abbd6adffb2b6f6a8328d65e41368d907a4cbb3c62be79d707f83e4e8b9de15a24d3073605f5ceea18866cc7ac1341078187c9d9e849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-scripts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
