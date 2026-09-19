SUMMARY = "Helper functions for op tree manipulation"
DESCRIPTION = "Helper functions for op tree manipulation"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.270.0"

RPM_NAME = "perl-B-Utils-0.270.0-1.8.aarch64.rpm"
RPM_HASH = "42ac420945e1a7847e9133fb1daaff24f0eed11251da9e198b4efae5a7ea64326cced3d02804dde8c3d13562873199619201d74bc114f8539254edf3622fa37c"

RPROVIDES:${PN} += "perl-B--Utils \
perl-B--Utils--OP \
perl-B-Utils"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Task--Weaken"

inherit rpm
