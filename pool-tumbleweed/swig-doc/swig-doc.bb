SUMMARY = "SWIG Manual"
DESCRIPTION = "SWIG is a compiler that attempts to make it easy to integrate C, C++, \
or Objective-C code with scripting languages including Perl, Tcl, and \
Python.  In a nutshell, you give it a bunch of ANSI C/C++ declarations \
and it generates an interface between C and your favorite scripting \
language.  However, this is only scratching the surface of what SWIG \
can do--some of its more advanced features include automatic \
documentation generation, module and library management, extensive \
customization options, and more. \
 \
This package contains the SWIG manual."
LICENSE = "BSD-3-Clause"

PV = "4.4.1"

RPM_NAME = "swig-doc-4.4.1-2.3.noarch.rpm"
RPM_HASH = "d5b12ba30a80fe29a6e36fcc05b4507eeda86d8fb1d423124b7195be1cdd2da0607a53a6197117f3ede1c48080669684312a37fd2d4f0889a4363a9f4cff00b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swig-doc"

RDEPENDS:${PN} += "swig"

inherit rpm
