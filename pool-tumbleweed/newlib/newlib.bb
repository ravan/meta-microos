SUMMARY = "C library intended for use on embedded systems"
DESCRIPTION = "Newlib is a C library intended for use on embedded systems. It is a \
conglomeration of several library parts, all under free software licenses \
that make them easily usable on embedded products."
LICENSE = "BSD-3-Clause & MIT & LGPL-2.0-or-later & ISC"

PV = "4.6.0.20260123"

RPM_NAME = "newlib-4.6.0.20260123-1.3.noarch.rpm"
RPM_HASH = "6337fcbdaf1a69d1458d368a5c452f19626097ebaedab690a6124c5db95656c780a071b89bdb7667853777a757aa9168de5536ed407160a8fd9725d4fd947275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "newlib"

RDEPENDS:${PN} += ""

inherit rpm
