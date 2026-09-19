SUMMARY = "Bindings for the OpenStack Compute API"
DESCRIPTION = "This class is an interface to the OpenStack Compute API. Also see the the \
oscompute manpage command line tool."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.1200"

RPM_NAME = "perl-Net-OpenStack-Compute-1.1200-1.38.noarch.rpm"
RPM_HASH = "392bdec47cb2e247f1051dad4b68f2b9ff4be2a5d00ef83b0fc3d5a4cbff65015d6685e7cf1c009d764920c562e4de1a091b57ec0ed211c55c289ed6c4a1feca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Net--OpenStack--Compute \
perl-Net--OpenStack--Compute--AuthRole \
perl-Net-OpenStack-Compute"

RDEPENDS:${PN} += "/usr/bin/env \
perl--MODULE-COMPAT-5.44.0 \
perl-App--Rad \
perl-App--Rad--Plugin--MoreHelp \
perl-HTTP--Request \
perl-JSON \
perl-LWP \
perl-Moose \
perl-Test--Most"

inherit rpm
