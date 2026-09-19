SUMMARY = "Documentation for texlive-chronos"
DESCRIPTION = "This package includes the documentation for texlive-chronos"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.3svn76924"

RPM_NAME = "texlive-chronos-doc-2026.226.0.0.9.3svn76924-60.2.noarch.rpm"
RPM_HASH = "8a68cb64d58520caeb468bbcbf8efa3ed4e8e37bcebae0aab7e3e5ed64cbefe933eb2eee28ae4531a24730d7048b094ee6f9f383c8d5c4bcc2e4ded43de99cf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chronos-doc"

RDEPENDS:${PN} += ""

inherit rpm
