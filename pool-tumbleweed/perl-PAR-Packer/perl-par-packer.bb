SUMMARY = "PAR Packager"
DESCRIPTION = "This module implements the *App::Packer::Backend* interface, for generating \
stand-alone executables, perl scripts and PAR files. \
 \
Currently, this module is used by the command line tool *pp* internally, as \
well as by the contributed _contrib/gui_pp/gpp_ program. \
 \
Since version 0.97 of PAR, this module and its related tools such as 'pp' \
have been stripped from the PAR distribution and are now distributed as the \
'PAR-Packer' distribution so that PAR users need not necessarily have a C \
compiler."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.64.0"

RPM_NAME = "perl-PAR-Packer-1.64.0-1.10.aarch64.rpm"
RPM_HASH = "f07b3e6316950ac7014f7049685af31aafab45c20af8d415c749d1bf389ae33ec8552466fce244ed80b0f77b3fb5a4d50610c928ce211b2850d28daf35d0557f"

RPROVIDES:${PN} += "perl-App--Packer--PAR \
perl-PAR--Filter \
perl-PAR--Filter--Bleach \
perl-PAR--Filter--Bytecode \
perl-PAR--Filter--Obfuscate \
perl-PAR--Filter--PatchContent \
perl-PAR--Filter--PodStrip \
perl-PAR--Packer \
perl-PAR--StrippedPARL--Base \
perl-PAR-Packer \
perl-pp"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libperl.so \
perl--MODULE-COMPAT-5.44.0 \
perl-Archive--Zip \
perl-Compress--Zlib \
perl-Digest--SHA \
perl-Getopt--ArgvFile \
perl-IO--Compress--Gzip \
perl-Module--ScanDeps \
perl-PAR \
perl-PAR--Dist"

inherit rpm
