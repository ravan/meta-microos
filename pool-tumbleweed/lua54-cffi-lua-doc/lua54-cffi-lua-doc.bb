SUMMARY = "Documentation for lua54-cffi-lua"
DESCRIPTION = "This subpackage contains documentation for lua54-cffi-lua."
LICENSE = "MIT"

PV = "0.2.3+git.1769216057.4c6197f"

RPM_NAME = "lua54-cffi-lua-doc-0.2.3+git.1769216057.4c6197f-1.4.noarch.rpm"
RPM_HASH = "07f96690758a8e83245abd5a935aebe4e6661812c65798b099fdc5378205b2a41812de0369ac9a6b838597011d04317877453b0d5c3ef1f1d0e85667785d11c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua54-cffi-lua-doc"

RDEPENDS:${PN} += ""

inherit rpm
