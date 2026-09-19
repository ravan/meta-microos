SUMMARY = "Tool to write CD-Rs in Disk-At-Once Mode"
DESCRIPTION = "CDRDAO creates CD-Rs in disk-at-once (DAO) mode driven by a description \
file called a TOC file. In DAO mode, it is possible to create \
non-standard track pregaps that have lengths other than 2 seconds and \
contain nonzero audio data. This is useful for dividing live recordings \
into tracks where 2 second gaps would be irritating."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.6"

RPM_NAME = "cdrdao-1.2.6-1.2.aarch64.rpm"
RPM_HASH = "96a847e5654f484f820167e127742e53d0af3af20a1c65f6629c56d9764d83aaa7656953bf45c3627a8666b68398faefcb2d5e8743a6b3a0e53e0b48bd685280"

RPROVIDES:${PN} += "cdrdao"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libao.so.4 \
libc.so.6 \
libgcc-s.so.1 \
libmad.so.0 \
libstdc++.so.6 \
libvorbisfile.so.3"

inherit rpm
