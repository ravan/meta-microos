SUMMARY = "Generate world unique message-ids"
DESCRIPTION = "Message-ids are optional, but highly recommended, headers that identify a \
message uniquely. This software generates a unique message-id."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.408"

RPM_NAME = "perl-Email-MessageID-1.408-1.18.noarch.rpm"
RPM_HASH = "5497fba20ead64710a6586205133ff91540c5fa6020177a8aa97cbafed0a6a87402290ecaef8a52907c0083fd3e61b4a05b983b118cd2f4e49f748e68865e37a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--MessageID \
perl-Email-MessageID"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
