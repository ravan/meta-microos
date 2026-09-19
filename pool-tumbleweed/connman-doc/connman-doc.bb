SUMMARY = "Connman reference man pages"
DESCRIPTION = "Documentation in form of man pages for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.42"

RPM_NAME = "connman-doc-1.42-2.16.aarch64.rpm"
RPM_HASH = "16d54ff1a3c87dd2085458c457c3ffb7d834981dfae2bbd002e34acc730af9347de814a238f36742710d3395e4fffcd8a6880dbc276fdda09291fb838bf01349"

RPROVIDES:${PN} += "connman-doc"

RDEPENDS:${PN} += ""

inherit rpm
