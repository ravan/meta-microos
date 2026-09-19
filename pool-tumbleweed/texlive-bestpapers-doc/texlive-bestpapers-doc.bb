SUMMARY = "Documentation for texlive-bestpapers"
DESCRIPTION = "This package includes the documentation for texlive-bestpapers"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.0svn76790"

RPM_NAME = "texlive-bestpapers-doc-2026.226.1.0svn76790-61.2.noarch.rpm"
RPM_HASH = "59da2f2b7411835b7c7838878f1430cdc913533d1199c0031c7ed1d44a48c9e7137ec69b4c0f7637f4efe17681863797eed4b9b6053eafe9303a4393ae6bc79c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bestpapers-doc"

RDEPENDS:${PN} += ""

inherit rpm
