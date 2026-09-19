SUMMARY = "OO interface for spell-checking a block of text"
DESCRIPTION = "This module is a thin layer above either Text::Aspell or Text::Hunspell \
(preferring the latter if available), and allows one to spellcheck a body \
of text. \
 \
Whereas Text::(Hu|A)spell deals with words, Text::Spellchecker deals with \
blocks of text. For instance, we provide methods for iterating through the \
text, serializing the object (thus remembering where we left off), and \
highlighting the current misspelled word within the text."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.14"

RPM_NAME = "perl-Text-SpellChecker-0.14-2.37.noarch.rpm"
RPM_HASH = "2da2cd4d8625bfc32da408123f3c6baf8285740e2a7f55e84d35389826429d35d2b1dd9a858ede73f988f257cf2c24134466804b7c83625dd1bfbde1bfdae584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Text--SpellChecker \
perl-Text-SpellChecker"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Text--Hunspell"

inherit rpm
