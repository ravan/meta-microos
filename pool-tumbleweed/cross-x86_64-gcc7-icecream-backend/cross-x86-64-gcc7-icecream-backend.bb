SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-x86_64-gcc7-icecream-backend-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "14deff83e3a6ead3c1e72b1d7836f62d5b9b47e492fe79cb85f489434dce0442064cc4bad519086e72f416e74e8c512bb7b126371b0e5214d991cadf09f9664b"

RPROVIDES:${PN} += "cross-x86-64-gcc7-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
