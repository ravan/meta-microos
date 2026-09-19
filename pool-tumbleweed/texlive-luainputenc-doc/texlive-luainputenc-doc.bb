SUMMARY = "Documentation for texlive-luainputenc"
DESCRIPTION = "This package includes the documentation for texlive-luainputenc"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.973svn77682"

RPM_NAME = "texlive-luainputenc-doc-2026.226.0.0.973svn77682-59.2.noarch.rpm"
RPM_HASH = "43aedbb72d2a73cdc0de1d561df60a12de04d85d5977bcb30d3efda81f9901959f2812b9903de3653e2cfa81079827d8c68373e3e0613ff2ee42ee92714de36d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luainputenc-doc"

RDEPENDS:${PN} += ""

inherit rpm
