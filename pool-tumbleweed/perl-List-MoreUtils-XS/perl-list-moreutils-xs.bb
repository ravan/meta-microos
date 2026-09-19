SUMMARY = "Provide compiled List::MoreUtils functions"
DESCRIPTION = "List::MoreUtils::XS is a backend for List::MoreUtils. Even if it's possible \
(because of user wishes) to have it practically independent from \
List::MoreUtils, it technically depend on 'List::MoreUtils'. Since it's \
only a backend, the API is not public and can change without any warning."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & Apache-2.0"

PV = "0.430"

RPM_NAME = "perl-List-MoreUtils-XS-0.430-1.36.aarch64.rpm"
RPM_HASH = "56114d8cea49820dc8f138475b7b0edb5a5ba5df42320b48ea11b1494cc624212b6a28b1f499dae5d8eff681b37557557f1740cc4df5a8628cc1179f04b636f1"

RPROVIDES:${PN} += "perl-List--MoreUtils--XS \
perl-List-MoreUtils-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-XSLoader"

inherit rpm
