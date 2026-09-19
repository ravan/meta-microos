SUMMARY = "Warewulf4 Reference book"
DESCRIPTION = "Reference documentation for warewulf4."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "warewulf4-reference-doc-4.7.0-4.1.noarch.rpm"
RPM_HASH = "f0aff6d6ab4eab1925a6c60c5d88765b527345830ac47b4790e8b40bbdce67fe72588b16c9a9f72d7b2be9e53f7492a8b6892352c62690f31bdbf92cf8914772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf4-reference-doc"

RDEPENDS:${PN} += ""

inherit rpm
