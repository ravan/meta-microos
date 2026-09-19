SUMMARY = "Text::German Perl module"
DESCRIPTION = "Text::German Perl module"
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "0.06"

RPM_NAME = "perl-Text-German-0.06-1.43.noarch.rpm"
RPM_HASH = "cde82c3f1361bb2174785a9afb378c24982a89af4000324f73af08fd5c38a463f30c9227418b990935b14b54e355eb366f22eb30988d77563eb8a7dc0c1af5e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--German \
perl-Text--German--Adjektiv \
perl-Text--German--Ausnahme \
perl-Text--German--Cache \
perl-Text--German--Endung \
perl-Text--German--Regel \
perl-Text--German--Util \
perl-Text--German--Verb \
perl-Text--German--Vorsilbe \
perl-Text-German"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
