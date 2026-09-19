SUMMARY = "IO Interface to compressed data files/buffers"
DESCRIPTION = "This is a stub module. It contains no code."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.224.0"

RPM_NAME = "perl-IO-Compress-2.224.0-1.1.noarch.rpm"
RPM_HASH = "970009432b2d08524e88e7b3026e763c5412ce1ede85cf705d1e5a970cd9e5408d2271f94bcd3a6f3c56788baafa3f1051bd7730817729e9379b5091b76f71c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Compress--Zlib \
perl-File--GlobMapper \
perl-IO--Compress \
perl-IO--Compress--Adapter--Bzip2 \
perl-IO--Compress--Adapter--Deflate \
perl-IO--Compress--Adapter--Identity \
perl-IO--Compress--Base \
perl-IO--Compress--Base--Common \
perl-IO--Compress--Bzip2 \
perl-IO--Compress--Deflate \
perl-IO--Compress--Gzip \
perl-IO--Compress--Gzip--Constants \
perl-IO--Compress--RawDeflate \
perl-IO--Compress--Zip \
perl-IO--Compress--Zip--Constants \
perl-IO--Compress--Zlib--Constants \
perl-IO--Compress--Zlib--Extra \
perl-IO--Uncompress--Adapter--Bunzip2 \
perl-IO--Uncompress--Adapter--Identity \
perl-IO--Uncompress--Adapter--Inflate \
perl-IO--Uncompress--AnyInflate \
perl-IO--Uncompress--AnyUncompress \
perl-IO--Uncompress--Base \
perl-IO--Uncompress--Bunzip2 \
perl-IO--Uncompress--Gunzip \
perl-IO--Uncompress--Inflate \
perl-IO--Uncompress--RawInflate \
perl-IO--Uncompress--Unzip \
perl-IO-Compress \
perl-U64 \
perl-Zlib--OldDeflate \
perl-Zlib--OldInflate"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Compress--Raw--Bzip2 \
perl-Compress--Raw--Zlib"

inherit rpm
