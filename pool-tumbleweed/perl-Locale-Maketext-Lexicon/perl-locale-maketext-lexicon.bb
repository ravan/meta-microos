SUMMARY = "Use other catalog formats in Maketext"
DESCRIPTION = "This module provides lexicon-handling modules to read from other \
localization formats, such as _Gettext_, _Msgcat_, and so on. \
 \
If you are unfamiliar with the concept of lexicon modules, please consult \
the Locale::Maketext manpage and the 'webl10n' HTML files in the 'docs/' \
directory of this module. \
 \
A command-line utility the xgettext.pl manpage is also installed with this \
module, for extracting translatable strings from source files."
LICENSE = "MIT"

PV = "1.00"

RPM_NAME = "perl-Locale-Maketext-Lexicon-1.00-1.43.noarch.rpm"
RPM_HASH = "28ba8c2464b91e7ddf2658af433f3eb5e8cd78edf30f283c99cf17fc27abba09296daf4767ac031f9e336900df66c493371d5a54afa47e49e021427611979c84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Locale--Maketext--Extract \
perl-Locale--Maketext--Extract--Plugin--Base \
perl-Locale--Maketext--Extract--Plugin--FormFu \
perl-Locale--Maketext--Extract--Plugin--FormFu--Extractor \
perl-Locale--Maketext--Extract--Plugin--Generic \
perl-Locale--Maketext--Extract--Plugin--Haml \
perl-Locale--Maketext--Extract--Plugin--Mason \
perl-Locale--Maketext--Extract--Plugin--PPI \
perl-Locale--Maketext--Extract--Plugin--Perl \
perl-Locale--Maketext--Extract--Plugin--TT2 \
perl-Locale--Maketext--Extract--Plugin--TT2--Directive \
perl-Locale--Maketext--Extract--Plugin--TT2--Parser \
perl-Locale--Maketext--Extract--Plugin--TextTemplate \
perl-Locale--Maketext--Extract--Plugin--TextTemplate--Parser \
perl-Locale--Maketext--Extract--Plugin--YAML \
perl-Locale--Maketext--Extract--Plugin--YAML--Extractor \
perl-Locale--Maketext--Extract--Run \
perl-Locale--Maketext--Lexicon \
perl-Locale--Maketext--Lexicon--Auto \
perl-Locale--Maketext--Lexicon--Gettext \
perl-Locale--Maketext--Lexicon--Msgcat \
perl-Locale--Maketext--Lexicon--Tie \
perl-Locale-Maketext-Lexicon"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Locale--Maketext"

inherit rpm
