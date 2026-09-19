SUMMARY = "SIP tool to create python bindings"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package contains all the developer tools you need to create your \
own sip bindings."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "4.19.25"

RPM_NAME = "python313-sip4-devel-4.19.25-8.6.aarch64.rpm"
RPM_HASH = "be36ed7f142ec4f6b2c9041d565fba031272651257b5c3793de40efd8d3ab4c341a607c567652ceed82bad3a827506dc0c6bb571962e85ca17fac75041fedd28"

RPROVIDES:${PN} += "python3-sip-bin \
python3-sip-devel \
python3-sip4-devel \
python313-sip-bin \
python313-sip-devel \
python313-sip4-devel \
rpm-macro-requires-python313-sip-api"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
c++-compiler \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-devel \
python313-sip4 \
python313-sip4-common"

inherit rpm
