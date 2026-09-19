SUMMARY = "Keep imports and functions out of your namespace"
DESCRIPTION = "Keep imports and functions out of your namespace"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.270.0"

RPM_NAME = "perl-namespace-clean-0.270.0-1.7.noarch.rpm"
RPM_HASH = "4793c39dc23609004cee2ac52bffc9aaf3aa2574cd8a11032f34ef225ace4255f575a25a9ecedc0adc710842a0a3745b1a68db7f19cb190d267f49ffb787c8b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-namespace--clean \
perl-namespace-clean"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-B--Hooks--EndOfScope \
perl-Package--Stash"

inherit rpm
