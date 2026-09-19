SUMMARY = "Easy access to any pastebin"
DESCRIPTION = "Pastebins (also known as nopaste sites) let you post text, usually code, \
for public viewing. They're used a lot in IRC channels to show code that \
would normally be too long to give directly in the channel (hence the name \
nopaste). \
 \
Each pastebin is slightly different. When one pastebin goes down (I'm \
looking at you, http://paste.husk.org), then you have to find a new one. \
And if you usually use a script to publish text, then it's too much hassle. \
 \
This module aims to smooth out the differences between pastebins, and \
provides redundancy: if one site doesn't work, it just tries a different \
one. \
 \
It's also modular: you only need to put on CPAN a \
App::Nopaste::Service::Foo module and anyone can begin using it."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.13.0"

RPM_NAME = "perl-App-Nopaste-1.13.0-1.7.noarch.rpm"
RPM_HASH = "98361b4ac264b116655765a1264fde64171f1afa8dac737ebf33457a7a84ba04d855e1fa2f40b1c841030f0ca1f1ceef090c1ed7cffe343b4d65cf3dfae6280f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Nopaste \
perl-App--Nopaste--Command \
perl-App--Nopaste--Service \
perl-App--Nopaste--Service--Codepeek \
perl-App--Nopaste--Service--Debian \
perl-App--Nopaste--Service--Gist \
perl-App--Nopaste--Service--GitLab \
perl-App--Nopaste--Service--Mojopaste \
perl-App--Nopaste--Service--PastebinCom \
perl-App--Nopaste--Service--Pastie \
perl-App--Nopaste--Service--Shadowcat \
perl-App--Nopaste--Service--Snitch \
perl-App--Nopaste--Service--Ubuntu \
perl-App--Nopaste--Service--ssh \
perl-App-Nopaste"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Class--Load \
perl-Getopt--Long--Descriptive \
perl-JSON--MaybeXS \
perl-LWP--UserAgent \
perl-Module--Pluggable \
perl-Module--Runtime \
perl-Path--Tiny \
perl-URI--Escape \
perl-WWW--Mechanize \
perl-namespace--clean \
perl-parent"

inherit rpm
