SUMMARY = "SWIG example files"
DESCRIPTION = "SWIG is a compiler that attempts to make it easy to integrate C, C++, \
or Objective-C code with scripting languages including Perl, Tcl, and \
Python.  In a nutshell, you give it a bunch of ANSI C/C++ declarations \
and it generates an interface between C and your favorite scripting \
language.  However, this is only scratching the surface of what SWIG \
can do--some of its more advanced features include automatic \
documentation generation, module and library management, extensive \
customization options, and more. \
 \
This package contains SWIG examples, useful both for testing and \
understandig SWIG usage."
LICENSE = "BSD-3-Clause"

PV = "4.4.1"

RPM_NAME = "swig-examples-4.4.1-2.3.noarch.rpm"
RPM_HASH = "63af0aef18615cfd054ea520157edb140ad01026abc4387a59fceebce70bb7e413827b4af4414485924f67d4263eb2c62bdabaf791f4ffca02c9f70448e6b396"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swig-examples"

RDEPENDS:${PN} += "swig"

inherit rpm
