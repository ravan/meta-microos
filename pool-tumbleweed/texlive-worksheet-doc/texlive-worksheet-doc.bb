SUMMARY = "Documentation for texlive-worksheet"
DESCRIPTION = "This package includes the documentation for texlive-worksheet"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-worksheet-doc-2026.226.1.1svn76924-60.2.noarch.rpm"
RPM_HASH = "59fb902d0630fb98861a9441e9d9d0a00caeb17cc321be2744a8e9badcc520d490a7702c5387f5c529aeadcbccea3a670255aab2a57e3231f37454a976a7d77f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-worksheet-doc"

RDEPENDS:${PN} += ""

inherit rpm
