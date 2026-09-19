SUMMARY = "Recursively create a directory tree"
DESCRIPTION = "This module was extracted from several near-identical copies used in the \
tests of some of my CPAN distributions."
LICENSE = "MIT"

PV = "0.0.1"

RPM_NAME = "perl-File-TreeCreate-0.0.1-1.24.noarch.rpm"
RPM_HASH = "13e986e2e657d4b893476846661b161d77b488ee08b47db58b469e3f7f76e9a03c5cf301686937279ddb1177fb61b1e9c9b05f9e962b526c064df7414fa3f476"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--TreeCreate \
perl-File-TreeCreate"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-autodie"

inherit rpm
