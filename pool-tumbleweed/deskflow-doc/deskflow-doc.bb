SUMMARY = "Documentation for deskflow"
DESCRIPTION = "Documentation for deskflow."
LICENSE = "GPL-2.0-only & MIT & SUSE-GPL-2.0-with-openssl-exception & LGPL-2.1-only"

PV = "1.26.0"

RPM_NAME = "deskflow-doc-1.26.0-2.3.noarch.rpm"
RPM_HASH = "9d3dd5aa0a8a4102e201b1250fff7a124eddd040509683e8692bcd715e621482dd87fd904c4d30ae50b40ccd41f5a09c61229a042357bcfb46ee65d9682c8e7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deskflow-doc"

RDEPENDS:${PN} += ""

inherit rpm
