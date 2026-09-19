SUMMARY = "Simple, sane and efficient file slurper [DISCOURAGED]"
DESCRIPTION = "This module provides functions for fast and correct slurping and spewing. \
All functions are optionally exported."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.4.0"

RPM_NAME = "perl-File-Slurp-Tiny-0.4.0-1.7.noarch.rpm"
RPM_HASH = "c1e7c22b39368a3eabec647d9b56e2e09cf8871239d92713f6dd10b2b4adf7136d382790150c18370a0544f667b06541f07f070f7554c535a859fb501cec21b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Slurp--Tiny \
perl-File-Slurp-Tiny"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
