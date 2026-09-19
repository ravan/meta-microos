SUMMARY = "Links substantially identical, duplicate files to save file system space"
DESCRIPTION = "Freedup eliminates duplicate files by linking them, and thus reduces the amount \
of used disk space within one or more file systems. By default, hardlinks are \
used on a single device, symbolic links when the devices differ. A set of \
options allows you to modify the methods of file comparison, the hash functions, \
the linking behavior, and the reporting style. You may use batch or interactive \
mode. Freedup usually only considers identical files, but when comparing audio \
or graphics files, you may elect to ignore the tags. Multimedia files often are \
a good target for deduplication."
LICENSE = "GPL-3.0-or-later"

PV = "1.6~3"

RPM_NAME = "freedup-1.6~3-4.9.aarch64.rpm"
RPM_HASH = "3a73caa1d5b44569d67642bbed9533ed90c27ab2256478923f572c4f8df6bf0e333e5e3f70d4ca3d2ebefe107744c8187a2cf19d09e824e8eb0c6e13a10e48c2"

RPROVIDES:${PN} += "freedup"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
