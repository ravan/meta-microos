SUMMARY = "Provide an interface to ZIP archive files"
DESCRIPTION = "The Archive::Zip module allows a Perl program to create, manipulate, read, \
and write Zip archive files. \
 \
Zip archives can be created, or you can read from existing zip files. \
 \
Once created, they can be written to files, streams, or strings. Members \
can be added, removed, extracted, replaced, rearranged, and enumerated. \
They can also be renamed or have their dates, comments, or other attributes \
queried or modified. Their data can be compressed or uncompressed as \
needed. \
 \
Members can be created from members in existing Zip files, or from existing \
directories, files, or strings. \
 \
This module uses the Compress::Raw::Zlib library to read and write the \
compressed streams inside the files. \
 \
One can use Archive::Zip::MemberRead to read the zip file archive members \
as if they were files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.680.0"

RPM_NAME = "perl-Archive-Zip-1.680.0-1.7.noarch.rpm"
RPM_HASH = "7558c2374a2d9def2ad06051998f88529172b56b3545b41480e39eb09c0896fa3312bc48d4ec664582ffe96184164ba277ce8a5eb1d5a34e912cf7a47d943a50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Archive--Zip \
perl-Archive--Zip--Archive \
perl-Archive--Zip--BufferedFileHandle \
perl-Archive--Zip--DirectoryMember \
perl-Archive--Zip--FileMember \
perl-Archive--Zip--Member \
perl-Archive--Zip--MemberRead \
perl-Archive--Zip--MockFileHandle \
perl-Archive--Zip--NewFileMember \
perl-Archive--Zip--StringMember \
perl-Archive--Zip--Tree \
perl-Archive--Zip--ZipFileMember \
perl-Archive-Zip"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Compress--Raw--Zlib"

inherit rpm
