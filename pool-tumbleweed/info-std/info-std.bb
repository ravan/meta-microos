SUMMARY = "The info pages of the Info Browser"
DESCRIPTION = "Info is a terminal-based program for reading documentation of computer \
programs in the Info format. The GNU Project distributes most of its \
on-line manuals in the Info format, so you need a program called 'Info \
reader' to read the manuals."
LICENSE = "GPL-3.0-or-later"

PV = "7.3"

RPM_NAME = "info-std-7.3-1.5.noarch.rpm"
RPM_HASH = "91c8ea3a550a63c8c7c5452347deb40809c0600fbc06a17c654f08024edb9491ce9325b40d1960934c39ac300ca197ec65b7581e4ee162756bae76e6d879f675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "info-std"

RDEPENDS:${PN} += ""

inherit rpm
