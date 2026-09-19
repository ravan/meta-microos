SUMMARY = "Documentation for texlive-datetime2-russian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-russian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn49345"

RPM_NAME = "texlive-datetime2-russian-doc-2026.226.1.1svn49345-59.2.noarch.rpm"
RPM_HASH = "49548684774f800affa987dfad7c62d56746bdffc7051dc08b504f5f406b1e8a522056199dac4ca957d33dd16b7d83fd6c765abdb47074a1e15e42c2b67e3bf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-russian-doc"

RDEPENDS:${PN} += ""

inherit rpm
