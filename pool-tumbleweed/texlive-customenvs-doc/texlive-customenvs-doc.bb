SUMMARY = "Documentation for texlive-customenvs"
DESCRIPTION = "This package includes the documentation for texlive-customenvs"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.42fsvn77387"

RPM_NAME = "texlive-customenvs-doc-2026.226.0.0.42fsvn77387-61.2.noarch.rpm"
RPM_HASH = "1da58dfbc7af409943cd4f8fac298ce00d9861b1b7d48a07346c46dcf1231325082bbbfe91d127e458b9bced9fac7334d7e5cf6840be1acf16de5079ba8c8041"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-customenvs-doc-fr \
texlive-customenvs-doc"

RDEPENDS:${PN} += ""

inherit rpm
