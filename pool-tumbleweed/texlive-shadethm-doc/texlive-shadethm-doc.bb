SUMMARY = "Documentation for texlive-shadethm"
DESCRIPTION = "This package includes the documentation for texlive-shadethm"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-shadethm-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "ad365b727b1545b9f694476d8d4d5971561348f4d1561bf8e8eed51b80f9ea0600c09ff76c1ff7245e15d822f37b7e8093215c2e78b0946bec72ecb89c03d9fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shadethm-doc"

RDEPENDS:${PN} += ""

inherit rpm
