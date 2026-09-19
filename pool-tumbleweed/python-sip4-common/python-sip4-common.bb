SUMMARY = "SIP tool to create python bindings -- common files"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package contains common files shared between python2 and python3 \
versions of sip."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "4.19.25"

RPM_NAME = "python-sip4-common-4.19.25-8.6.noarch.rpm"
RPM_HASH = "4ef931df9027e4fe243a50bc3f2d29f46f44703f45d990d9133339a17596041d48b08c886798a4c83f6dcb307771b5654b8e712023834c2e2e36f54993a263bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-sip4-common \
python313-sip4-common \
python314-sip4-common \
rpm-macro-python-sip-api-ver \
rpm-macro-requires-python3-sip-api"

RDEPENDS:${PN} += ""

inherit rpm
