SUMMARY = "Symbol versioning helper (Documentation)"
DESCRIPTION = "Documentation for the symbol versioning helper python314-abimap"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python314-abimap-doc-0.4.0-1.5.noarch.rpm"
RPM_HASH = "31b499bbda04ccd44808294a5fb06e4ab4e76a615883785d5e36f513b3fd81172a46c649cbe1333c8ca3a4a1f0d60af00f2b8add4d4c3e219779caf7e969f670"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-abimap-doc"

RDEPENDS:${PN} += ""

inherit rpm
