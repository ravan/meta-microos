SUMMARY = "An strong archive file unpacker, based on mime-types"
DESCRIPTION = "File::Unpack2 is an unpacker for archives and files \
(bz2/gz/zip/tar/cpio/iso/rpm/deb/cab/lzma/7z/rar/...).  We call \
it strong, because it is not fooled by file suffixes, or multiply wrapped packages. \
It reliably detects mime-types and recursivly descends into each archive found \
until it finally exposes all unpackable payload contents. \
A precise logfile can be written, describing mimetypes and unpack actions. \
Most of the known archive file formats are supported. Shell-script-style \
plugins can be added to support additinal formats."
LICENSE = "GPL-1.0-or-later | Artistic-1.0"

PV = "1.0"

RPM_NAME = "perl-File-Unpack2-1.0-1.16.aarch64.rpm"
RPM_HASH = "f3f9fc85f2695555eeda3e57bcc9d6d6a3cb5bbb9661378c83537c155b1ac20bc358e6ccfd3f08d99cb5f41919a9dca135073f7fc43e6351f7f033ddb2001c5e"

RPROVIDES:${PN} += "perl-File--Unpack2 \
perl-File-Unpack2"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
binutils \
bzip2 \
cabextract \
cpio \
file \
file-unpack2 \
gzip \
lzip \
mkisofs \
p7zip-full \
perl--MODULE-COMPAT-5.44.0 \
perl-BSD--Resource \
perl-Carp \
perl-Compress--Raw--Bzip2 \
perl-Compress--Raw--Lzma \
perl-Compress--Raw--Zlib \
perl-Cwd \
perl-File--LibMagic \
perl-File--MimeInfo--Magic \
perl-File--Path \
perl-File--Temp \
perl-Filesys--Statvfs \
perl-IPC--Run \
perl-JSON \
perl-String-ShellQuote \
perl-Text--Sprintf--Named \
poppler-tools \
rpm \
shared-mime-info \
sharutils \
tar \
unzip \
xz"

inherit rpm
