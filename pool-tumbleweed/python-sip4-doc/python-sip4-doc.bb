SUMMARY = "SIP tool to create python bindings -- common documentation"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package contains common documentation files shared between python2 \
and python3 versions of sip."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "4.19.25"

RPM_NAME = "python-sip4-doc-4.19.25-8.6.noarch.rpm"
RPM_HASH = "27317e81a46e8dcebabb19e3ad259ba5015a805af7efb600328d1387e1ba81ee8fca4d342a80933ee838e8ed966157e0605411a8b5fc45c49f7dce5b28b314bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-sip4-doc \
python313-sip4-doc \
python314-sip4-doc"

RDEPENDS:${PN} += ""

inherit rpm
