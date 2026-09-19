SUMMARY = "Documentation for texlive-boondox"
DESCRIPTION = "This package includes the documentation for texlive-boondox"
LICENSE = "OFL-1.1"

PV = "2026.226.1.02dsvn77682"

RPM_NAME = "texlive-boondox-doc-2026.226.1.02dsvn77682-59.2.noarch.rpm"
RPM_HASH = "7b243f17b77f6a9403894a157e8a987acf5da6ca3eac96b3540fee68ca279ab9246f1dad9bf94d3042cdbc2b5badd5e8808764766ecc9c20424c016747aefe76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boondox-doc"

RDEPENDS:${PN} += ""

inherit rpm
