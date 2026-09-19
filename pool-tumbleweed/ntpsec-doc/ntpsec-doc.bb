SUMMARY = "Documentation for ntpsec"
DESCRIPTION = "Documentation files generated from asciidoc for ntpsec."
LICENSE = "BSD-2-Clause & NTP & BSD-3-Clause & MIT"

PV = "1.2.5"

RPM_NAME = "ntpsec-doc-1.2.5-1.1.noarch.rpm"
RPM_HASH = "7c34cbae509445e7f9b118817e95579bcd80404d2f49094179428ebe55614d06d60bbb211eb7f578cb952019025f9ff14a36c40e1cc7f3ef9a1e4a3e03ef4b2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ntpsec-doc"

RDEPENDS:${PN} += ""

inherit rpm
