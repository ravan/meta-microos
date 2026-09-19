SUMMARY = "Communicate with the i3 window manager"
DESCRIPTION = "communicate with the i3 window manager"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.190.0"

RPM_NAME = "perl-AnyEvent-I3-0.190.0-1.12.noarch.rpm"
RPM_HASH = "5fff20ac95b4390347cd3935bf5eea68a48edae73439a49cff0db8c8cc396600afbbbe5e4135af6fa36ab16b03f08f80098b415ea78446708852c59f149745a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-AnyEvent--I3 \
perl-AnyEvent-I3"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-AnyEvent \
perl-AnyEvent--Handle \
perl-AnyEvent--Socket \
perl-JSON--XS"

inherit rpm
