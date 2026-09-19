SUMMARY = "Documentation for texlive-ryethesis"
DESCRIPTION = "This package includes the documentation for texlive-ryethesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.36svn76924"

RPM_NAME = "texlive-ryethesis-doc-2026.226.1.36svn76924-60.2.noarch.rpm"
RPM_HASH = "6852f052e4a80e8f24ac5fd97011bb5e6fafd70950732fd2427a0d54d05ec77551efd064c44dc57aac1aa45c8fa877300e2603d10c48aea9f9830ab8f96becab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ryethesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
