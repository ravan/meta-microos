SUMMARY = "Module signature file manipulation"
DESCRIPTION = "*Module::Signature* adds cryptographic authentications to CPAN \
distributions, via the special _SIGNATURE_ file. \
 \
If you are a module user, all you have to do is to remember to run \
'cpansign -v' (or just 'cpansign') before issuing 'perl Makefile.PL' or \
'perl Build.PL'; that will ensure the distribution has not been tampered \
with. \
 \
Module authors can easily add the _SIGNATURE_ file to the distribution \
tarball; see NOTES below for how to do it as part of 'make dist'. \
 \
If you _really_ want to sign a distribution manually, simply add \
'SIGNATURE' to _MANIFEST_, then type 'cpansign -s' immediately before 'make \
dist'. Be sure to delete the _SIGNATURE_ file afterwards. \
 \
Please also see NOTES about _MANIFEST.SKIP_ issues, especially if you are \
using *Module::Build* or writing your own _MANIFEST.SKIP_. \
 \
Signatures made with Module::Signature prior to version 0.82 used the SHA1 \
algorithm by default. SHA1 is now considered broken, and therefore module \
authors are strongly encouraged to regenerate their _SIGNATURE_ files. \
Users verifying old SHA1 signature files will receive a warning."
LICENSE = "(Artistic-1.0 | GPL-1.0-or-later) & CC0-1.0"

PV = "0.960.0"

RPM_NAME = "perl-Module-Signature-0.960.0-1.3.noarch.rpm"
RPM_HASH = "212aeec9c7f0d1e5bc41d6a417356375175436e3fae825a21c33cb60c8f6097eab1e4992c501791cf043d1a89fae6d827e0d24ad7238bc631740ca29cee51060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Module--Signature \
perl-Module-Signature"

RDEPENDS:${PN} += "/usr/bin/perl \
gpg \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
