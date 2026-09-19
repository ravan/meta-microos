SUMMARY = "Documentation for texlive-footmisc"
DESCRIPTION = "This package includes the documentation for texlive-footmisc"
LICENSE = "LPPL-1.0"

PV = "2026.226.7.0bsvn77682"

RPM_NAME = "texlive-footmisc-doc-2026.226.7.0bsvn77682-60.2.noarch.rpm"
RPM_HASH = "dea408e268132b8a1375d75fa9f9ba5cb8aa1f1cce4c5ec2e90c6a6a17186c18bad7a4316e9c712ac8608d43782efd67e373a3098d247cb3710229adf118fafa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footmisc-doc"

RDEPENDS:${PN} += ""

inherit rpm
