SUMMARY = "Check the correct line endings in your project"
DESCRIPTION = "This module scans your project/distribution for any perl files (scripts, \
modules, etc) for the presence of windows line endings."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.02"

RPM_NAME = "perl-Test-EOL-2.02-1.27.noarch.rpm"
RPM_HASH = "954bc53180705ac482c129506db83ba121212197bccbcfcd5910e8c6ab8f549656ad272ed8a6b2ee5387d3d9b8f8c01645c8e420a8d55bf2328f72841bac93ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Test--EOL \
perl-Test-EOL"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
