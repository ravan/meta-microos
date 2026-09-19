SUMMARY = "A YAFFS file system parser and extractor"
DESCRIPTION = "A YAFFS file system parser and extractor writte in pure python. \
 \
Features: \
 - List and/or extract regular files, folders, symlinks, hard \
   links, and special device files \
 - Automatic detection and/or brute force of YAFFS build parameters \
   (page size, spare size, endianess, etc) \
 - Support for both big and little endian YAFFS file systems"
LICENSE = "MIT"

PV = "0.1+git.20160105"

RPM_NAME = "yaffshiv-0.1+git.20160105-1.20.noarch.rpm"
RPM_HASH = "ba4186799638efb036a7e9badb0b6e63ef311716a920c11e1d4dcceeb66b1d436b426f8cc392f8b59a23ff50b256faffdc021d0a32b2420a8946829e7c499e1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-yaffshiv \
python3dist-yaffshiv \
yaffshiv"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
