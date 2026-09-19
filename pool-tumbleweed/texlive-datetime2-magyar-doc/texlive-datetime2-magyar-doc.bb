SUMMARY = "Documentation for texlive-datetime2-magyar"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-magyar"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn48266"

RPM_NAME = "texlive-datetime2-magyar-doc-2026.226.1.1svn48266-59.2.noarch.rpm"
RPM_HASH = "add4e3ff58eeca94d9ae8d5e991e55b49bfc22e956115e937d476aa2afedc24d8dce4b79de9886512bd7529d32243a71514c3a0c05ade78409c173b7a620f1d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-magyar-doc"

RDEPENDS:${PN} += ""

inherit rpm
