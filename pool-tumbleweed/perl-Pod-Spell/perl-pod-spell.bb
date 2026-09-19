SUMMARY = "Formatter for spellchecking Pod"
DESCRIPTION = "Pod::Spell is a Pod formatter whose output is good for spellchecking. \
Pod::Spell is rather like Pod::Text, except that it doesn't put much effort \
into actual formatting, and it suppresses things that look like Perl \
symbols or Perl jargon (so that your spellchecking program won't complain \
about mystery words like ''$thing'' or ''Foo::Bar'' or 'hashref'). \
 \
This class works by filtering out words that look like Perl or any form of \
computerese (like ''$thing'' or ''N>7'' or ''@{$foo}{'bar','baz'}'', \
anything in C<...> or F<...> codes, anything in verbatim paragraphs (code \
blocks), and anything in the stopword list. The default stopword list for a \
document starts out from the stopword list defined by Pod::Wordlist, and \
can be supplemented (on a per-document basis) by having ''=for stopwords'' \
/ ''=for :stopwords'' region(s) in a document."
LICENSE = "Artistic-2.0"

PV = "1.270.0"

RPM_NAME = "perl-Pod-Spell-1.270.0-1.10.noarch.rpm"
RPM_HASH = "c72f5b68ac33ce3f93ef5ec6d651e7738f69e12de3f3dc6a8584c2490880382f2a9a687938bbbacc8c3253ffc5cda1217fb0cc2590c6bd0fb6d87fad7c3150ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pod--Spell \
perl-Pod--Wordlist \
perl-Pod-Spell"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Class--Tiny \
perl-File--ShareDir \
perl-Lingua--EN--Inflect \
perl-Pod--Escapes \
perl-Pod--Simple \
perl-parent"

inherit rpm
