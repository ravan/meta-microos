SUMMARY = "Documentation for texlive-autoarea"
DESCRIPTION = "This package includes the documentation for texlive-autoarea"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3asvn59552"

RPM_NAME = "texlive-autoarea-doc-2026.226.0.0.3asvn59552-60.2.noarch.rpm"
RPM_HASH = "385f34cec803c694caa149637666b18ac54e8fa560acec64c5a9bd615733cae32c21467f1b007d9e3f8dfc73acf8ad52e30927e563eef8908541bd26463fa10c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-autoarea-doc"

RDEPENDS:${PN} += ""

inherit rpm
