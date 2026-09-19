SUMMARY = "Documentation for texlive-edichokey"
DESCRIPTION = "This package includes the documentation for texlive-edichokey"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.01ysvn56223"

RPM_NAME = "texlive-edichokey-doc-2026.226.2.01ysvn56223-61.4.noarch.rpm"
RPM_HASH = "cfe2c489ea429ab089ea610fb1a9d9923e3807d93708efdcdcf4fa429d1048df7ee6a5095f0e339b1b55090c214b777d143bb70166b403dc9c44bea613078e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edichokey-doc"

RDEPENDS:${PN} += ""

inherit rpm
