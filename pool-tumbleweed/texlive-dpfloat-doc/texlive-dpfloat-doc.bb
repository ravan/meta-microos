SUMMARY = "Documentation for texlive-dpfloat"
DESCRIPTION = "This package includes the documentation for texlive-dpfloat"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-dpfloat-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "3a1e5e671999c35c6ac2c301e703ad7a66f2848862b0e2ad76ac23b7112187863f9d8a80589eb39aa5b663f6e16bac24ec2c591c2a5c21a8b4d1a4940a77b3ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dpfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
