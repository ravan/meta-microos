SUMMARY = "Documentation for texlive-heuristica"
DESCRIPTION = "This package includes the documentation for texlive-heuristica"
LICENSE = "OFL-1.1"

PV = "2026.226.1.093svn77682"

RPM_NAME = "texlive-heuristica-doc-2026.226.1.093svn77682-60.4.noarch.rpm"
RPM_HASH = "40e6fba1f0b7c1d317ef8240fad4a50ee012b541b690b6eb60f0731db5a23d5371d7809eb347c3bc00cbe4fcd7807af72febee3da3e2df91456823c450130f1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-heuristica-doc"

RDEPENDS:${PN} += ""

inherit rpm
