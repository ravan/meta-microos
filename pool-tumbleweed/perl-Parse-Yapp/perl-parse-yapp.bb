SUMMARY = "Perl extension for generating and using LALR parsers"
DESCRIPTION = "Parse::Yapp (Yet Another Perl Parser compiler) is a collection of modules \
that let you generate and use yacc like thread safe (reentrant) parsers \
with perl object oriented interface. \
 \
The script yapp is a front-end to the Parse::Yapp module and let you easily \
create a Perl OO parser from an input grammar file."
LICENSE = "Artistic-1.0 | GPL-2.0+"

PV = "1.21"

RPM_NAME = "perl-Parse-Yapp-1.21-1.37.noarch.rpm"
RPM_HASH = "be27865f888860cada39a3c3b210933cfa4f36397b8faf376419c3c775e8f5f65f1d3241bd3936332a348361bd076f6169ea6bb57ff3f6d1a78c7ffd6ee55fba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Parse--Yapp \
perl-Parse--Yapp--Driver \
perl-Parse--Yapp--Grammar \
perl-Parse--Yapp--Lalr \
perl-Parse--Yapp--Options \
perl-Parse--Yapp--Output \
perl-Parse--Yapp--Parse \
perl-Parse-Yapp"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
