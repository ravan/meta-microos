SUMMARY = "Documentation for texlive-noto-emoji"
DESCRIPTION = "This package includes the documentation for texlive-noto-emoji"
LICENSE = "OFL-1.1"

PV = "2026.226.2.034svn62950"

RPM_NAME = "texlive-noto-emoji-doc-2026.226.2.034svn62950-61.2.noarch.rpm"
RPM_HASH = "c685eccf40c8792b1b2be657cfdb07b2c08bc50c8af603d0bb8bbfb7e7ff34b92455b49b591daf5e6964cb40a535823e1ce87ba91f283d1344b095d5ef6fa2f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-noto-emoji-doc"

RDEPENDS:${PN} += ""

inherit rpm
