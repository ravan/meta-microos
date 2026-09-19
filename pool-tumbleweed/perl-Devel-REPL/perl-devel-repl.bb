SUMMARY = "Modern perl interactive shell"
DESCRIPTION = "This is an interactive shell for Perl, commonly known as a REPL - Read, \
Evaluate, Print, Loop. The shell provides for rapid development or testing \
of code without the need to create a temporary source code file. \
 \
Through a plugin system, many features are available on demand. You can \
also tailor the environment through the use of profiles and run control \
files, for example to pre-load certain Perl modules when working on a \
particular project."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.3.29"

RPM_NAME = "perl-Devel-REPL-1.3.29-1.7.noarch.rpm"
RPM_HASH = "00656b4932c41b2ca4c3b4ba2fa4dc9f23a8b3a7044abb1da1d037f2c2d826858089470f8ad12ccbe226e3e85b16c57c2ceb77534cf7ebab997025a06c4aa41a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Devel--REPL \
perl-Devel--REPL--Error \
perl-Devel--REPL--Meta--Plugin \
perl-Devel--REPL--Plugin \
perl-Devel--REPL--Plugin--B--Concise \
perl-Devel--REPL--Plugin--Colors \
perl-Devel--REPL--Plugin--Commands \
perl-Devel--REPL--Plugin--Completion \
perl-Devel--REPL--Plugin--CompletionDriver--Globals \
perl-Devel--REPL--Plugin--CompletionDriver--INC \
perl-Devel--REPL--Plugin--CompletionDriver--Keywords \
perl-Devel--REPL--Plugin--CompletionDriver--LexEnv \
perl-Devel--REPL--Plugin--CompletionDriver--Methods \
perl-Devel--REPL--Plugin--CompletionDriver--Turtles \
perl-Devel--REPL--Plugin--DDC \
perl-Devel--REPL--Plugin--DDS \
perl-Devel--REPL--Plugin--DumpHistory \
perl-Devel--REPL--Plugin--FancyPrompt \
perl-Devel--REPL--Plugin--FindVariable \
perl-Devel--REPL--Plugin--History \
perl-Devel--REPL--Plugin--Interrupt \
perl-Devel--REPL--Plugin--LexEnv \
perl-Devel--REPL--Plugin--MultiLine--PPI \
perl-Devel--REPL--Plugin--Nopaste \
perl-Devel--REPL--Plugin--OutputCache \
perl-Devel--REPL--Plugin--PPI \
perl-Devel--REPL--Plugin--Packages \
perl-Devel--REPL--Plugin--Peek \
perl-Devel--REPL--Plugin--ReadLineHistory \
perl-Devel--REPL--Plugin--Refresh \
perl-Devel--REPL--Plugin--ShowClass \
perl-Devel--REPL--Plugin--Timing \
perl-Devel--REPL--Plugin--Turtles \
perl-Devel--REPL--Profile \
perl-Devel--REPL--Profile--Default \
perl-Devel--REPL--Profile--Minimal \
perl-Devel--REPL--Profile--Standard \
perl-Devel--REPL--Script \
perl-Devel-REPL"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-B--Keywords \
perl-Data--Dump--Streamer \
perl-Data--Dumper--Concise \
perl-File--Next \
perl-Lexical--Persistence \
perl-Module--Runtime \
perl-Moose \
perl-Moose--Meta--Role \
perl-Moose--Role \
perl-MooseX--Getopt \
perl-MooseX--Object--Pluggable \
perl-PPI \
perl-Task--Weaken \
perl-namespace--autoclean"

inherit rpm
