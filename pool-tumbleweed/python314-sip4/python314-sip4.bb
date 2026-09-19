SUMMARY = "SIP tool to use python sip bindings - legacy version 4"
DESCRIPTION = "SIP is a tool that makes it very easy to create Python bindings for C \
and C++ libraries. It was originally developed to create PyQt, the \
Python bindings for the Qt toolkit, but can be used to create bindings \
for any C or C++ library. \
 \
This package provides the legacy version 4 of the SIP tool"
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "4.19.25"

RPM_NAME = "python314-sip4-4.19.25-8.6.aarch64.rpm"
RPM_HASH = "3a7feb4198a0f6a3389b676814bd740bafd5610f77b7ae76d4cd046bc318ecdba9d0a4b8b8c2d94431a35ecdaa36b850d71070e9859b25e479f96a902d855534"

RPROVIDES:${PN} += "python3.14dist-sip \
python314-sip \
python314-sip-api \
python314-sip4 \
python3dist-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.14.so.1.0 \
python-abi \
python314-sip4-common"

inherit rpm
