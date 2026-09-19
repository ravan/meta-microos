SUMMARY = "Trim whitespace from your strings"
DESCRIPTION = "'String::Trim' trims whitespace off your strings. chomp trims only '$/' \
(typically, that's newline), but 'trim' will trim all leading and trailing \
whitespace."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.005"

RPM_NAME = "perl-String-Trim-0.005-1.26.noarch.rpm"
RPM_HASH = "04390011b4e4937de46730d82cd3cb4c36e435fc923c8fe4e699d4b904ac3d8b047c8f2ab8722600d1bd751be4b9b93140109fa3ba4cd9cb98573df5b0a7232c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-String--Trim \
perl-String-Trim"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
