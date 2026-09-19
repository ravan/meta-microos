SUMMARY = "Patch perl source a la Devel::PPPort's buildperl.pl"
DESCRIPTION = "Devel::PatchPerl is a modularisation of the patching code contained in \
Devel::PPPort's 'buildperl.pl'. \
 \
It does not build perls, it merely provides an interface to the source \
patching functionality."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.140.0"

RPM_NAME = "perl-Devel-PatchPerl-2.140.0-1.5.aarch64.rpm"
RPM_HASH = "818ae6e9529459c6b594d5f2f4e33da70e431549f2af000373151ca8835af135373e645faba5ec7d8f4a8e2ac8809be563dcbf0c7cca63309ee15f45a522bbbb"

RPROVIDES:${PN} += "perl-Devel--PatchPerl \
perl-Devel--PatchPerl--Hints \
perl-Devel--PatchPerl--Plugin \
perl-Devel--PatchPerl--Plugin--TEST \
perl-Devel-PatchPerl"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-File--pushd \
perl-Module--Pluggable"

inherit rpm
