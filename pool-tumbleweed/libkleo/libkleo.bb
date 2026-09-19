SUMMARY = "Base package of Kleopatra, a key manager by KDE"
DESCRIPTION = "libkleo is a library used by KDE PIM applications to handle cryptographic key \
and certificate management."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libkleo-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "02ab107872493745673915e16c489e7fb068c87fa6dad890ec2864fc0e22bad43a1720e40804a5485998f1d41f2842a508e55a381ca0dc0b4b2b303b6ba447b0"

RPROVIDES:${PN} += "config-libkleo \
libkleo"

RDEPENDS:${PN} += ""

inherit rpm
