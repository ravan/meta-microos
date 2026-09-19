SUMMARY = "Documentation for texlive-punknova"
DESCRIPTION = "This package includes the documentation for texlive-punknova"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.003svn24649"

RPM_NAME = "texlive-punknova-doc-2026.226.1.003svn24649-60.4.noarch.rpm"
RPM_HASH = "032df6d147fd62b7810831d62c1e270ee3e7e660121ac161fcd416176e5a3a4231d295daf8876f9eef94b20f6cd9852ad416771352f95b765fdb8135159abfee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-punknova-doc"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
