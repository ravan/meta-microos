SUMMARY = "Documentation for texlive-refman"
DESCRIPTION = "This package includes the documentation for texlive-refman"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0esvn15878"

RPM_NAME = "texlive-refman-doc-2026.226.2.0esvn15878-60.4.noarch.rpm"
RPM_HASH = "f3e68d843d8aa9e94ef92bdde781085c71c9c79eeed7dbfef1b67425fcbacf71f54a7092e68dae0adfcd2e3c0cb33b0029b88b9af4fa5281f1baed7f1b97c436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-refman-doc-de;en \
texlive-refman-doc"

RDEPENDS:${PN} += ""

inherit rpm
