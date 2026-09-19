SUMMARY = "Censor sensitive stuff in a data structure"
DESCRIPTION = "censor sensitive stuff in a data structure"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.40.0"

RPM_NAME = "perl-Data-Censor-0.40.0-1.3.noarch.rpm"
RPM_HASH = "67717a076b1e4563b423f4aa56764794b6bd1304edd414309ba7f0bd7256b69188cef1388e1be314c534d5b46c1663a558618609f5c581f2c3bd869c88cce6aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Data--Censor \
perl-Data-Censor"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Ref--Util"

inherit rpm
