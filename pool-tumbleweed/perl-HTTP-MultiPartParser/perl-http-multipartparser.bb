SUMMARY = "HTTP MultiPart Parser"
DESCRIPTION = "This class provides a low-level API for processing MultiPart MIME data \
streams conforming to MultiPart types as defined in at \
http://tools.ietf.org/html/rfc2616#section-3.7.2."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.02"

RPM_NAME = "perl-HTTP-MultiPartParser-0.02-1.30.noarch.rpm"
RPM_HASH = "f55756986717f775871b831f7b26abc1511d58d78f249dd91b9a43176fbbdf4975bdc85ae1ef496b97b528696fec228906735a0a8a9e7a30f94d1af1c5c07ce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-HTTP--MultiPartParser \
perl-HTTP-MultiPartParser"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
