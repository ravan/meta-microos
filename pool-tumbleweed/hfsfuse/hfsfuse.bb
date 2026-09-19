SUMMARY = "FUSE driver for HFS+ filesystems"
DESCRIPTION = "FUSE driver for HFS+ filesystems, based on NetBSD's kernel driver with modifications. \
 \
hfsfuse embeds and extends NetBSD's HFS+ kernel driver into a portable library for use \
with FUSE and other userspace tools. hfsfuse was created for use on FreeBSD and other \
Unix-like systems that lack a native HFS+ driver, but can also be used on Linux and \
macOS as an alternative to their kernel drivers. \
 \
hfsfuse also includes two standalone tools, hfsdump and hfstar, which can be used \
without FUSE. \
 \
This driver is read-only and cannot write to or alter the target filesystem. \
 \
Supported \
 \
 * Journaled and non-journaled HFS+ \
 * Unicode normalization for pathnames via utf8proc \
 * Hard links, including directory hard links (i.e. Time Machine backups) \
 * Resource fork, Finder info, and creation/backup time access via extended attributes \
 * birthtime (with compatible FUSE) \
 * User-defined extended attributes \
 * HFS+ compression with zlib and lzfse \
 \
Not supported \
 \
 * HFS without the '+', aka 'Mac OS Standard' volumes. For these, try hfsutils. \
 * Writing"
LICENSE = "BSD-1-Clause & BSD-2-Clause & BSD-3-Clause & MIT"

PV = "0.435"

RPM_NAME = "hfsfuse-0.435-1.1.aarch64.rpm"
RPM_HASH = "af67472871a185168a5749471816a17bb32ada2bd26ee2a84c46bf4d7647c0cd2eee4a6ab2ab2eb7c1391c5116ebcc661727077e0eacb73b29348a49e5749df1"

RPROVIDES:${PN} += "hfsfuse"

RDEPENDS:${PN} += "libarchive.so.13 \
libc.so.6 \
libfuse3.so.4 \
liblzfse.so \
libutf8proc.so.3 \
libz.so.1"

inherit rpm
