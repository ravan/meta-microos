SUMMARY = "Documentation for texlive-gentium-sil"
DESCRIPTION = "This package includes the documentation for texlive-gentium-sil"
LICENSE = "OFL-1.1"

PV = "2026.226.7.000svn75783"

RPM_NAME = "texlive-gentium-sil-doc-2026.226.7.000svn75783-60.2.noarch.rpm"
RPM_HASH = "12c62a24b46573b915b0880fc37e1c0e8324090c9e38e388d179f3457c413e5b09072012a270ba9ce50d65df0c3ec55c507a488704fd10360b5b357c7d5ba8f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gentium-sil-doc"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
