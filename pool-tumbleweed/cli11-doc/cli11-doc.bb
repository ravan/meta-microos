SUMMARY = "Documentation for CLI11"
DESCRIPTION = "This package contains documentation for CLI11 \
 \
CLI11 is a command line parser for C++11 and beyond that provides a \
rich feature set. It is header only, and has a number of design \
limits by choice: \
 \
 * No completion of partial options (like --ve for --version, \
   if it were unambiguous) \
 * No wide strings/Unicode"
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "cli11-doc-2.7.2-1.1.noarch.rpm"
RPM_HASH = "6c364bff2a8ef3ab42a942b55cdde449c7d1fac2996561f0e9d46fc428bb049d66154d9afcf50dada7f72c4366a7f25876dcf110da1c1158f67b44b46ed24dcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cli11-doc"

RDEPENDS:${PN} += ""

inherit rpm
