SUMMARY = "Java NFA regular expression engine (demo and samples)"
DESCRIPTION = "Demonstrations and samples for Java NFA regular expression engine gnu-regexp."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.4"

RPM_NAME = "gnu-regexp-demo-1.1.4-293.25.noarch.rpm"
RPM_HASH = "bce4f985a582e7a2f1b78241eb4b2bf79486c75b2c05f5c16bbd951aa79a99099f69e3b0e60387c19b6e1d8ab7553e535d66d406939ea0c05ee6da9fb4d0ba27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-regexp-demo"

RDEPENDS:${PN} += "gnu-getopt \
gnu-regexp"

inherit rpm
