SUMMARY = "Library to work with several different streaming archive formats"
DESCRIPTION = "Libarchive is a programming library that can create and read several \
different streaming archive formats, including most popular tar \
variants and several cpio formats. It can also write shar archives and \
read ISO-9660 CDROM images. The bsdtar program is an implementation of \
tar(1) that is built on top of libarchive. It started as a test \
harness, but has grown and is now the standard system tar for FreeBSD 5 \
and 6. \
 \
The libarchive library offers a number of features that make it both \
very flexible and very powerful. \
 \
- Automatic format detection: libarchive can automatically determine \
   both the compression and the archive format, regardless of the \
   data source. Most tar implementations do not automatically detect \
   the compression format, few implementation that can correctly do \
   this when reading from stdin or a socket. (The tar program \
   included with Gunnar Ritter's heirloom collection also does full \
   automatic format detection.) \
 \
- Writes POSIX formats: libarchive writes POSIX-standard formats, \
   including 'ustar,' 'pax interchange format,' and the POSIX 'cpio' \
   format. \
 \
- Supports pax interchange format: Pax interchange format (which, \
   despite the name, is really an extended tar format) eliminates \
   almost all limitations of historic tar formats and provides a \
   standard method for incorporating vendor-specific extensions. \
   libarchive exploits this extension mechanism to support ACLs and \
   file flags, for example. (Joerg Schilling's star archiver is \
   another open-source tar program that supports pax interchange \
   format.) \
 \
- Reads popular formats: libarchive can read GNU tar, ustar, pax \
   interchange format, cpio, and older tar variants. The internal \
   architecture is easily extensible. The only requirement for \
   support is that it be possible to read the format without seeking \
   in the file. (For example, a format that includes a compressed \
   size field before the data cannot be correctly written without \
   seeking.) \
 \
- High-Level API: the libarchive API makes it fairly simple to build \
   an archive from a list of filenames or to extract the entries \
   from an archive. However, the API also provides extreme \
   flexibility with regards to data sources. For example, there are \
   generic hooks that allow you to write an archive to a socket or \
   read data from an archive entry into a memory buffer. \
 \
- Extensible. The internal design uses generic interfaces for \
compression, archive format detection and decoding, and archive data \
I/O. It should be very easy to add new formats, new compression \
methods, or new ways of reading/writing archives."
LICENSE = "BSD-2-Clause"

PV = "3.8.9"

RPM_NAME = "libarchive13-3.8.9-1.1.aarch64.rpm"
RPM_HASH = "b6b63d4caea30b98f042ada5de4fbcd1dc96be117e4209fdbb4f68214e82952a73413ab9849867b707123aa6c2a07a14beef86f5f0e1d8d437b3d90bebb9e299"

RPROVIDES:${PN} += "libarchive.so.13 \
libarchive13"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblz4.so.1 \
liblzma.so.5 \
libxml2.so.16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
