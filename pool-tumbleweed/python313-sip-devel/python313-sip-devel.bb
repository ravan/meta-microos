SUMMARY = "A Python bindings generator for C/C++ libraries"
DESCRIPTION = "SIP is a collection of tools that makes it very easy to create Python \
bindings for C and C++ libraries. It was originally developed in 1998 \
to create PyQt, the Python bindings for the Qt toolkit, but can be used \
to create bindings for any C or C++ library. For example it is also used \
to generate wxPython, the Python bindings for wxWidgets. \
 \
This package contains all the developer tools you need to create your \
own sip bindings in the currently default version. Look for \
python313-sip<N>-devel, if you need to build a package with a \
specific version of SIP v<N>."
LICENSE = "GPL-2.0-only | GPL-3.0-only | SUSE-SIP"

PV = "6.16.1"

RPM_NAME = "python313-sip-devel-6.16.1-7.14.noarch.rpm"
RPM_HASH = "c809fda6ccebdce96fc6314351124b114066cdd798cd82be564e647c8fa11a393f031a561595601d74a8d401f2635b6ebec50178520df975749cd4a1f94b17aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sip-devel \
python313-sip-devel"

RDEPENDS:${PN} += "python313-sip6-devel"

inherit rpm
