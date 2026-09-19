SUMMARY = "Simple CPAN package extractor"
DESCRIPTION = "This is a fork of Archive::Any by Michael Schwern and Clint Moore. The main \
difference is this works properly even when you fork(), and may require \
less memory to extract a tarball. On the other hand, this isn't pluggable \
(this only supports file formats used in the CPAN toolchains), and this \
doesn't check mime types (at least as of this writing)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.110.0"

RPM_NAME = "perl-Archive-Any-Lite-0.110.0-1.7.noarch.rpm"
RPM_HASH = "4357f725e4f24228b2aa91444d7aba4d0e9102d8e720ad56d84cb5a4bb776c78eacd44b0836a4fd4dcee438f5267e7ce84b5f6dbc8710730facee95532aa80ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Any--Lite \
perl-Archive--Any--Lite--Tar \
perl-Archive--Any--Lite--Zip \
perl-Archive-Any-Lite"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-Archive--Tar \
perl-Archive--Zip \
perl-File--Temp \
perl-IO--Uncompress--Bunzip2 \
perl-IO--Zlib"

inherit rpm
