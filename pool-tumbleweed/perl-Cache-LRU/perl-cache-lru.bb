SUMMARY = "Simple, fast implementation of LRU cache in pure perl"
DESCRIPTION = "Cache::LRU is a simple, fast implementation of an in-memory LRU cache in \
pure perl."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.40.0"

RPM_NAME = "perl-Cache-LRU-0.40.0-1.7.noarch.rpm"
RPM_HASH = "c49764cae90ecaf3d347f9c33443ce44bbbaef823f83b3c51a07a081cd9fd6d43178b3d98c34737c042dac9f50a57e46a0c7b598edf00643dee90c85b02ce847"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Cache--LRU \
perl-Cache-LRU"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
