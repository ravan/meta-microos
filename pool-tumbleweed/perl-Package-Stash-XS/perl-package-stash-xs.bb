SUMMARY = "Faster and more correct implementation of the Package::Stash API"
DESCRIPTION = "This is a backend for Package::Stash, which provides the functionality in a \
way that's less buggy and much faster. It will be used by default if it's \
installed, and should be preferred in all environments with a compiler."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.300.0"

RPM_NAME = "perl-Package-Stash-XS-0.300.0-1.8.aarch64.rpm"
RPM_HASH = "792996a7803806d9f29614d886d4a1ecba97bf209f77c3939b3960fa618e1c5639f6ecb818afbebaff4ff447afb2d3b00c481b831643eafb310fa3e06f1e4d1e"

RPROVIDES:${PN} += "perl-Package--Stash--XS \
perl-Package-Stash-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
