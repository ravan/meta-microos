SUMMARY = "JFFS2 filesystem extraction tool"
DESCRIPTION = "A JFFS2 filesystem extraction tool written in python. \
 \
Features: \
 - Big/Little Endian support \
 - JFFS2_COMPR_ZLIB, JFFS2_COMPR_RTIME, and \
   JFFS2_COMPR_LZMA compression support \
 - CRC checks - for now only enforced on hdr_crc \
 - Extraction of symlinks, directories, files, and device nodes \
 - Detection/handling of duplicate inode numbers. Occurs if multiple \
   JFFS2 filesystems are found in one file and causes jefferson \
   to treat segments as separate filesystems"
LICENSE = "MIT"

PV = "0.4.1+git.20220705"

RPM_NAME = "jefferson-0.4.1+git.20220705-1.17.noarch.rpm"
RPM_HASH = "ef89495387fecbd723c2205ada282bf3b94ebae15a98e3f5daafbfebfc3ad943477bd2027947a279a998aaec999220f488658889b6a5b168b3f98e2b0767c7be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jefferson \
python3.13dist-jefferson \
python3dist-jefferson"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-cstruct \
python3-pylzma"

inherit rpm
