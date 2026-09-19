SUMMARY = "Documentation for vhs"
DESCRIPTION = "Documentation files and examples for vhs."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "vhs-doc-0.9.0-1.19.noarch.rpm"
RPM_HASH = "90e314bc126197632cbd66a6f7b686075f89bce663f2e10d88dfe45901c1cde9035b551846806046345511cdc34e8d33c7dc661961cc7e9d4686f6c41513a43b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vhs-doc"

RDEPENDS:${PN} += "bash-completion \
vhs"

inherit rpm
