SUMMARY = "App Module ad utilities for appspec tool"
DESCRIPTION = "This is the app class for the appspec command line tool. It contains \
utilities for App::Spec files, like generating completion or pod from it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.6.0"

RPM_NAME = "perl-App-AppSpec-0.6.0-1.3.noarch.rpm"
RPM_HASH = "a77a058a1ac65828d6d474d45420e882163cf8ee5cc80a465f765508f70d9c4ec20ed594bed88fc5a6abfaa7064da5c80165422819649b16d5896b6d5543b03b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--AppSpec \
perl-App--AppSpec--Schema--Validator \
perl-App--AppSpec--Spec \
perl-App-AppSpec"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-App--Spec \
perl-App--Spec--Pod \
perl-App--Spec--Run--Cmd \
perl-App--Spec--Schema \
perl-JSON--Validator \
perl-List--Util \
perl-Moo \
perl-YAML--PP"

inherit rpm
