SUMMARY = "Smart cangjie(scj) input schema for rime"
DESCRIPTION = "Smart cangjie(scj) input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-scj-20250315-1.4.noarch.rpm"
RPM_HASH = "9e870b968dd5d8944ec419ba7229303930f2f11850605635588aea97a43701d6777bdb3b0fbb2726a82e918de4ddeb904e53a82ac1ec62ac1c78d5bd664d76be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-scj"

RDEPENDS:${PN} += ""

inherit rpm
