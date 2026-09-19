SUMMARY = "Library for Handling Page Faults in User Mode"
DESCRIPTION = "This is a library for handling page faults in user mode. A page fault occurs \
when a program tries to access to a region of memory that is currently not \
available."
LICENSE = "GPL-2.0-or-later"

PV = "2.15"

RPM_NAME = "libsigsegv-doc-2.15-1.1.aarch64.rpm"
RPM_HASH = "452beaca5cbfaacf88c634346d5acf8a1d8ff0d6887bb481a05d8de23a39b8aee32412d6e5cf0d78b3c8cbacbffa4f446f0f4d933bdd44702719cd48e103c09e"

RPROVIDES:${PN} += "libsigsegv-doc"

RDEPENDS:${PN} += ""

inherit rpm
