SUMMARY = "Tools for file system and volume forensic analysis"
DESCRIPTION = "The Sleuth Kit (TSK) is a collection of UNIX-based command line tools that \
allow you to investigate a computer. The current focus of the tools is the \
file and volume systems and TSK supports FAT, Ext2/3, NTFS, UFS, \
and ISO 9660 file systems"
LICENSE = "CPL-1.0 & IPL-1.0 & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "sleuthkit-4.14.0-1.8.aarch64.rpm"
RPM_HASH = "b2e0ad835af3d1fa93e8fd97cac56b02424538ed05d13696be98c31f2ff8f539d87286b5c00c9c4bfb2cea2ed938c1b479c404215e99cebf077cb699c1eea1bf"

RPROVIDES:${PN} += "fiwalk \
sleuthkit"

RDEPENDS:${PN} += "/usr/bin/perl \
file \
ld-linux-aarch64.so.1 \
libc.so.6 \
libewf.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtsk.so.23 \
libtsk23 \
mac-robber"

inherit rpm
