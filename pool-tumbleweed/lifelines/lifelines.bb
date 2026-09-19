SUMMARY = "The Lifelines Genealogy Program"
DESCRIPTION = "Lifelines is terminal-based program that allows the tracking of \
genealogical information.  The lifelines reports are the power of the \
system but requires knowledge in the ll format."
LICENSE = "MIT"

PV = "3.1.1+42ce4bda"

RPM_NAME = "lifelines-3.1.1+42ce4bda-1.4.aarch64.rpm"
RPM_HASH = "4303279c46ccab534fc1469faa019e0686c276112ff2c6b44da33e5ecee339856c0216f39db3ef68f849884cb076e7a208115df98fca2a25f0eb8611b89fe2d1"

RPROVIDES:${PN} += "config-lifelines \
lifelines"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
