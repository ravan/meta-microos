SUMMARY = "A Python bindings generator for C/C++ libraries"
DESCRIPTION = "SIP is a collection of tools that makes it very easy to create Python \
bindings for C and C++ libraries. It was originally developed in 1998 \
to create PyQt, the Python bindings for the Qt toolkit, but can be used \
to create bindings for any C or C++ library. For example it is also used \
to generate wxPython, the Python bindings for wxWidgets. \
 \
This package contains all the developer tools you need to create your \
own sip bindings in the currently default version. Look for \
python314-sip<N>-devel, if you need to build a package with a \
specific version of SIP v<N>."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "6.16.1"

RPM_NAME = "python314-sip-devel-6.16.1-7.14.noarch.rpm"
RPM_HASH = "1ab7bda93616635acb6a7fa3cfa4fe58b53f0b69469956a5a4d97e9fb12270ced16a48fcb4a9e516cc95131f9f2c7cb1436a84eccd73b8e99898349d31f73a4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python314-sip-devel"

RDEPENDS:${PN} += "python314-sip6-devel"

inherit rpm
