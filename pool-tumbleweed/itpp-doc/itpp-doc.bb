SUMMARY = "Documentation for itpp"
DESCRIPTION = "This package contains the documentation for the IT++ as html and man pages. \
 \
IT++ is a C++ library of mathematical, signal processing and \
communication classes and functions. Its main use is in simulation of \
communication systems and for performing research in the area of \
communications. The kernel of the library consists of generic vector and \
matrix classes, and a set of accompanying routines. Such a kernel makes \
IT++ similar to MATLAB or GNU Octave."
LICENSE = "GPL-3.0-only"

PV = "4.3.1"

RPM_NAME = "itpp-doc-4.3.1-1.3.noarch.rpm"
RPM_HASH = "71cd9fd29da4a6392c6dc76b2f4142bbd1aad426ff321f6cfb021c09929cdd204e1c4c46a404ae98d364bc5c2e7dcbb3ed84c354f768f4a7f7101842163beff6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "itpp-doc"

RDEPENDS:${PN} += "libitpp8"

inherit rpm
