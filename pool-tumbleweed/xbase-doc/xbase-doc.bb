SUMMARY = "Developer documentation for XBase Compatible C++ Class Library"
DESCRIPTION = "Developer documentation for XBase (dBase and FoxPro, for example) \
compatible C++ class library. \
 \
This package contains header files, a library, some command line tools, \
and developer documentation."
LICENSE = "LGPL-2.1+"

PV = "3.1.2"

RPM_NAME = "xbase-doc-3.1.2-1.36.aarch64.rpm"
RPM_HASH = "5ea36d6168ddb8655da4a496aa91842658b0ec20f25bb1d16d9dc88a51fd5a3fce7e05fc9392f4809bff72c2699e2c5e7c645ce7e2141e7b5ff967a69c0adfe0"

RPROVIDES:${PN} += "xbase-/usr/share/doc/packages/xbase-doc/html/classes.html \
xbase-doc"

RDEPENDS:${PN} += "xbase"

inherit rpm
