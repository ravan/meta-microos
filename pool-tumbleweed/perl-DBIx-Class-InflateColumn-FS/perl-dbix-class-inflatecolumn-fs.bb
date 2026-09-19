SUMMARY = "Inflate/deflate columns to Path::Class::File objects"
DESCRIPTION = "Provides inflation to a Path::Class::File object allowing file system \
storage of BLOBS. \
 \
The storage path is specified with 'fs_column_path'. Each file receives a \
unique name, so the storage for all FS columns can share the same path. \
 \
Within the path specified by 'fs_column_path', files are stored in \
sub-directories based on the first 2 characters of the unique file names. \
Up to 256 sub-directories will be created, as needed. Override \
'_fs_column_dirs' in a derived class to change this behavior. \
 \
'fs_new_on_update' will create a new file name if the file has been \
updated."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.01007"

RPM_NAME = "perl-DBIx-Class-InflateColumn-FS-0.01007-2.33.noarch.rpm"
RPM_HASH = "e89e11362d8d22d9a23eb9e50942ff3d4d4259ae873c3cc8e5008a5404ab88eadffab0e34d528fbcff142f5bb67de5a7e7af93423e2cdf2eecc45c2b413ecabd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-DBIx--Class--InflateColumn--FS \
perl-DBIx--Class--InflateColumn--FS--ResultSet \
perl-DBIx-Class-InflateColumn-FS"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBD--SQLite \
perl-DBICx--TestDatabase \
perl-DBIx--Class \
perl-DBIx--Class--UUIDColumns \
perl-Path--Class"

inherit rpm
