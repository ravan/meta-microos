SUMMARY = "Acmeist PEG Parser Framework"
DESCRIPTION = "Pegex is an Acmeist parser framework. It allows you to easily create \
parsers that will work equivalently in lots of programming languages! The \
inspiration for Pegex comes from the parsing engine upon which the \
postmodern programming language *Perl 6* is based on. Pegex brings this \
beauty to the other _just_modern languages that have a normal regular \
expression engine available. \
 \
Pegex gets it name by combining Parsing Expression Grammars (PEG), with \
Regular Expressions (Regex). That's actually what Pegex does. \
 \
PEG is the cool new way to elegantly specify recursive descent grammars. \
The Perl 6 language is defined in terms of a self modifying PEG language \
called *Perl 6 Rules*. Regexes are familiar to programmers of most modern \
programming languages. Pegex defines a simple PEG syntax, where all the \
terminals are regexes. This means that Pegex can be quite fast and \
powerful. \
 \
Pegex attempts to be the simplest way to define new (or old) Domain \
Specific Languages (DSLs) that need to be used in several programming \
languages and environments. Things like JSON, YAML, Markdown etc. It also \
great for writing parsers/compilers that only need to work in one language."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.750.0"

RPM_NAME = "perl-Pegex-0.750.0-1.4.noarch.rpm"
RPM_HASH = "27ac6aa86e51ccf2beb3ca108dc7c737dbe8857580275a92ab4a1c245b707076c8067653b2da4fb7a06790ebf78b8fa4ce761c07d476e63340ce3931586fbfa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Pegex \
perl-Pegex--Base \
perl-Pegex--Bootstrap \
perl-Pegex--Compiler \
perl-Pegex--Constant \
perl-Pegex--Grammar \
perl-Pegex--Grammar--Atoms \
perl-Pegex--Input \
perl-Pegex--Module \
perl-Pegex--Optimizer \
perl-Pegex--Parser \
perl-Pegex--Parser--Indent \
perl-Pegex--Pegex--AST \
perl-Pegex--Pegex--Grammar \
perl-Pegex--Receiver \
perl-Pegex--Regex \
perl-Pegex--Tree \
perl-Pegex--Tree--Wrap"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--ShareDir--Install \
perl-JSON--PP \
perl-XXX \
perl-YAML--PP"

inherit rpm
