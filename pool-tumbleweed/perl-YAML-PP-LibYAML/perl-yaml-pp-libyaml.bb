SUMMARY = "Faster parsing for YAML::PP"
DESCRIPTION = "YAML::PP::LibYAML is a subclass of YAML::PP. Instead of using \
YAML::PP::Parser as a the backend parser, it uses YAML::PP::LibYAML::Parser \
which calls YAML::LibYAML::API, an XS wrapper around the 'C libyaml'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.005"

RPM_NAME = "perl-YAML-PP-LibYAML-0.005-1.28.noarch.rpm"
RPM_HASH = "244beafdb49169161e51398d2afba33310806684debbd670d9044c3e47e0fc5b027216b78ea3837c5af392771dabab4a6eeee6fa83551959ea3b1cc0a7967138"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-YAML--PP--LibYAML \
perl-YAML--PP--LibYAML--Emitter \
perl-YAML--PP--LibYAML--Parser \
perl-YAML-PP-LibYAML"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-YAML--LibYAML--API \
perl-YAML--LibYAML--API--XS \
perl-YAML--PP \
perl-YAML--PP--Emitter \
perl-YAML--PP--Parser \
perl-YAML--PP--Reader \
perl-YAML--PP--Writer"

inherit rpm
