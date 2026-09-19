SUMMARY = "Library and tools to access LUKS Disk Encryption encrypted files"
DESCRIPTION = "Library and tools to access the New Technology File System (NTFS). \
 \
Note that this project currently only focuses on the analysis of the format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "python314-libluksde-20260902-1.2.aarch64.rpm"
RPM_HASH = "e6ee709c0d703e5f25ce357c12778c6417c2fe16636c654e1314bf616408a95616b5497110701c1f81992650c7692c87f78241b7916cbf344ab9dbe4feec7a36"

RPROVIDES:${PN} += "python314-libluksde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libluksde.so.1 \
python-abi"

inherit rpm
