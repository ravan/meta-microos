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

RPM_NAME = "python314-sip4-devel-4.19.25-8.6.aarch64.rpm"
RPM_HASH = "113c2478b92fba5900c7934eba1f86e9dd79f3d03dfbea93d82c8baea0cb909eab66fb404c3056a1a9c2ff80ec7748cd53b16baada56ce9343d40ea3ff69ecc3"

RPROVIDES:${PN} += "python314-sip-bin \
python314-sip-devel \
python314-sip4-devel \
rpm-macro-requires-python314-sip-api"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
c++-compiler \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-devel \
python314-sip4 \
python314-sip4-common"

inherit rpm
