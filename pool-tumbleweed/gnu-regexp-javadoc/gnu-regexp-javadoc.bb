SUMMARY = "Java NFA regular expression engine (documentation)"
DESCRIPTION = "Javadoc for Java NFA regular expression engine gnu-regexp."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.4"

RPM_NAME = "gnu-regexp-javadoc-1.1.4-293.25.noarch.rpm"
RPM_HASH = "d91799ba2c2cc85dcfcee81b819302ea0f7efef91683ad67e8a667588e4c77cdc0db9bba840a88b4eeba210ddc917f1908ea824f5f11a926a30e07f12b580d48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnu-regexp-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
