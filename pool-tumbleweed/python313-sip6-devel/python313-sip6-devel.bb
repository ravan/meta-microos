SUMMARY = "A Python bindings generator for C/C++ libraries"
DESCRIPTION = "SIP is a collection of tools that makes it very easy to create Python \
bindings for C and C++ libraries. It was originally developed in 1998 \
to create PyQt, the Python bindings for the Qt toolkit, but can be used \
to create bindings for any C or C++ library. For example it is also used \
to generate wxPython, the Python bindings for wxWidgets. \
 \
This package contains all the developer tools you need to create your \
own sip bindings."
LICENSE = "BSD-2-Clause"

PV = "6.16.1"

RPM_NAME = "python313-sip6-devel-6.16.1-1.1.noarch.rpm"
RPM_HASH = "d41ebb3fc7e96cddba146c406aeb6f5a412a0385a89bedaebe1cd754814fda1a23a5e1812e6496db1ddd77f10c61876b9da2748c4f26d5a276632edcad2eb3e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sip-devel \
python3-sip-impl \
python3-sip6-devel \
python3.13dist-sip \
python313-sip-devel \
python313-sip-impl \
python313-sip6-devel \
python3dist-sip"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
c++-compiler \
python-abi \
python313-base \
python313-packaging \
python313-setuptools"

inherit rpm
