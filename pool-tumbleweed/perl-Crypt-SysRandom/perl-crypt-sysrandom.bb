SUMMARY = "Perl interface to system randomness"
DESCRIPTION = "This module uses whatever interface is available to procure \
cryptographically random data from the system."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.7.0"

RPM_NAME = "perl-Crypt-SysRandom-0.7.0-1.6.noarch.rpm"
RPM_HASH = "f9f7fcc1f404ff20e136353a846336ae80fee1e05ad402b46a5ed6f317f9a2ad5fe14b06245941bd7f4ca04039fc07135f183ce79806e22e80f6b98f12a90332"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Crypt--SysRandom \
perl-Crypt-SysRandom"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
