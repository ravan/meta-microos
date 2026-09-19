SUMMARY = "Manage perl installations in your $HOME"
DESCRIPTION = "perlbrew is a program to automate the building and installation of perl in \
an easy way. It provides multiple isolated perl environments, and a \
mechanism for you to switch between them. \
 \
Everything are installed unter '~/perl5/perlbrew'. You then need to include \
a bashrc/cshrc provided by perlbrew to tweak the PATH for you. You then can \
benefit from not having to run 'sudo' commands to install cpan modules \
because those are installed inside your 'HOME' too. \
 \
For the documentation of perlbrew usage see perlbrew command on at \
https://metacpan.org/, or by running 'perlbrew help', or by visiting at \
https://perlbrew.pl/. The following documentation features the API of \
'App::perlbrew' module, and may not be remotely close to what your want to \
read."
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "perl-App-perlbrew-1.10.0-1.7.noarch.rpm"
RPM_HASH = "274e0695a7518c1d84c536909384c87e11334c0a4c6643fec604d9bd2f5aea874d8ac7f43e757c499af4ab0220ffd39eee9a45e39bd6a91d5367ff83bd657a57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--Perlbrew--HTTP \
perl-App--Perlbrew--Path \
perl-App--Perlbrew--Path--Installation \
perl-App--Perlbrew--Path--Installations \
perl-App--Perlbrew--Path--Root \
perl-App--Perlbrew--Sys \
perl-App--Perlbrew--Util \
perl-App--perlbrew \
perl-App-perlbrew"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-CPAN--Perl--Releases \
perl-Capture--Tiny \
perl-Devel--PatchPerl \
perl-ExtUtils--MakeMaker \
perl-File--Temp \
perl-JSON--PP \
perl-Pod--Usage \
perl-local--lib"

inherit rpm
