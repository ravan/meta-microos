SUMMARY = "API documentation for GiNaC in HTML format"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language. \
 \
This package provides the API documentation for GiNaC in HTML format."
LICENSE = "GPL-2.0-only"

PV = "1.8.10"

RPM_NAME = "ginac-doc-html-1.8.10-1.4.noarch.rpm"
RPM_HASH = "55836ef7375488b1dc2f74c9c0e4092bdb2aa42ddd9c2e58fbf9e58d0babe312f29691c35aa20097acc17fa285a9c765e377916bcc9504b77a673509ffdb7670"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ginac-doc-html"

RDEPENDS:${PN} += ""

inherit rpm
