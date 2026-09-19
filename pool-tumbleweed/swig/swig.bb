SUMMARY = "Simplified Wrapper and Interface Generator"
DESCRIPTION = "SWIG is a compiler that attempts to make it easy to integrate C, C++, \
or Objective-C code with scripting languages including Perl, Tcl, and \
Python.  In a nutshell, you give it a bunch of ANSI C/C++ declarations \
and it generates an interface between C and your favorite scripting \
language.  However, this is only scratching the surface of what SWIG \
can do--some of its more advanced features include automatic \
documentation generation, module and library management, extensive \
customization options, and more."
LICENSE = "BSD-3-Clause & GPL-3.0-or-later"

PV = "4.4.1"

RPM_NAME = "swig-4.4.1-2.3.aarch64.rpm"
RPM_HASH = "8c821f2675d80717aac93551d8c275976938571f646f41ae19dbb1ac462feb1f73bf047e9bd899b4505f3bc21e2a723cbc91f1297c6a257d6dd072afc069a726"

RPROVIDES:${PN} += "swig"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpcre2-8.so.0 \
libstdc++.so.6"

inherit rpm
