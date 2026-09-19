SUMMARY = "Determine MIME types of data or files using libmagic"
DESCRIPTION = "The 'File::LibMagic' module is a simple perl interface to libmagic from the \
file package (version 4.x or 5.x). You will need both the library \
(_libmagic.so_) and the header file (_magic.h_) to build this Perl module."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.23"

RPM_NAME = "perl-File-LibMagic-1.23-1.34.aarch64.rpm"
RPM_HASH = "9b77bb16c47e6083a07e4deac8d8b675e8b0dc9b2863a8ef728d6ee05657b80a3aea9e766e26cdc1bd29f5a7a0a6e1b6400bc6f452035efb494c31540ddf50cf"

RPROVIDES:${PN} += "perl-File--LibMagic \
perl-File--LibMagic--Constants \
perl-File-LibMagic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmagic.so.1 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
