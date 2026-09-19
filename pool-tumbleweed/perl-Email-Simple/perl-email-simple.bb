SUMMARY = "Simple parsing of RFC2822 message format and headers"
DESCRIPTION = "The Email:: namespace was begun as a reaction against the increasing \
complexity and bugginess of Perl's existing email modules. 'Email::*' \
modules are meant to be simple to use and to maintain, pared to the bone, \
fast, minimal in their external dependencies, and correct."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.218"

RPM_NAME = "perl-Email-Simple-2.218-1.17.noarch.rpm"
RPM_HASH = "cc4e893c0ce959d0159d2f3916afbbc643d40d6ca4fb5b1b1b93d8489a02769c59d4f02a0b4df0123db3ae006c1ea4333b2c0451f07f90fc9ae986fdcc0751bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Email--Simple \
perl-Email--Simple--Creator \
perl-Email--Simple--Header \
perl-Email-Simple"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Email--Date--Format"

inherit rpm
