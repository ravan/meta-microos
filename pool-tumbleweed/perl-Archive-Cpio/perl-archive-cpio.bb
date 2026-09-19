SUMMARY = "Module for manipulations of cpio archives"
DESCRIPTION = "Archive::Cpio provides a few functions to read and write cpio files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.100.0"

RPM_NAME = "perl-Archive-Cpio-0.100.0-1.7.noarch.rpm"
RPM_HASH = "303129c4b8ca0df768b94fa444183e6003d5a949a75f36b64add25aac86eeba1e4485e0f612f20696b74fc1d0deebb82313cff02564277e9fda9faff10ca5fc7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Cpio \
perl-Archive--Cpio--Common \
perl-Archive--Cpio--File \
perl-Archive--Cpio--FileHandle-with-pushback \
perl-Archive--Cpio--NewAscii \
perl-Archive--Cpio--ODC \
perl-Archive--Cpio--OldBinary \
perl-Archive-Cpio"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
