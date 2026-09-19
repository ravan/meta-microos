SUMMARY = "Manual for the lite version of nanoxml"
DESCRIPTION = "Documentation for the lite version of nanoxml."
LICENSE = "Zlib"

PV = "2.2.3"

RPM_NAME = "nanoxml-manual-lite-2.2.3-6.10.noarch.rpm"
RPM_HASH = "68c1456f67bac9ca81d4b2a710b16bfc42da69159c10ba1cde108d30eb17ceafc33e5463502ac098ebbe04fd41bd1c75993d7a76eaad2153da6299e1c0878a8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nanoxml-manual-lite"

RDEPENDS:${PN} += ""

inherit rpm
