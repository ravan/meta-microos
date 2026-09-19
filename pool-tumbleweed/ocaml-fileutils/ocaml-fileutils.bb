SUMMARY = "OCaml library for common file and filename operations"
DESCRIPTION = "This library is intended to provide a basic interface to the most \
common file and filename operations.  It provides several different \
filename functions: reduce, make_absolute, make_relative...  It also \
enables you to manipulate real files: cp, mv, rm, touch... \
 \
It is separated into two modules: SysUtil and SysPath.  The first one \
manipulates real files, the second one is made for manipulating \
abstract filenames."
LICENSE = "SUSE-LGPL-2.0-with-linking-exception"

PV = "0.6.6"

RPM_NAME = "ocaml-fileutils-0.6.6-2.1.aarch64.rpm"
RPM_HASH = "68af23eb0db232d578d0d4ee737dd14ecbfadf71391aede41f42eba7a119aeef1eae2c8cdc61d3630c5b064cb56388bebd94b3844f8d8de6eeb575c5979194af"

RPROVIDES:${PN} += "ocaml-fileutils"

RDEPENDS:${PN} += ""

inherit rpm
