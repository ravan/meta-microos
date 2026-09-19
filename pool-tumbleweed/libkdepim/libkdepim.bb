SUMMARY = "Base package of kdepim"
DESCRIPTION = "This package contains the libkdepim library."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libkdepim-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4321cea9f77e9cf0a7dc9bc8eb9765387ccc94cb0c6b8bda4ac0457f59212a10c035a8e4dea71c8f080f497f21e37f48099f63f642efc424ad416ffcb07a46c1"

RPROVIDES:${PN} += "libkdepim"

RDEPENDS:${PN} += ""

inherit rpm
