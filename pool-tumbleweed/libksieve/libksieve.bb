SUMMARY = "Sieve and Managesieve support library for KDE PIM applications"
DESCRIPTION = "This package contains the libksieve library, which is used to support \
the Sieve server-side mail filtering protocol in KDE PIM applications."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libksieve-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "05ab5581735e6dfe9d602b581619ffc89ee54371d26d194e7d9ace2f28b3e2ec6f6d65840f2bf8deaaa567b7cc9ac55419340b79b167ef8c8263e17614cab271"

RPROVIDES:${PN} += "libksieve"

RDEPENDS:${PN} += ""

inherit rpm
