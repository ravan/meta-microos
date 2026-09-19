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

RPM_NAME = "python314-sip6-devel-6.16.1-1.1.noarch.rpm"
RPM_HASH = "c4105a8fbee94521e37e4973240c8d3a772cfbb33c4c590a2887c152903589670e0ac38be7dd9fc5acb62833b0942d4bf4d258edd152eca1aa39341823f4ce5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sip \
python314-sip-devel \
python314-sip-impl \
python314-sip6-devel \
python3dist-sip"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
c++-compiler \
python-abi \
python314-base \
python314-packaging \
python314-setuptools"

inherit rpm
