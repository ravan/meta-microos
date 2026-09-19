SUMMARY = "A Command Line Editor for ID3 V2 tags"
DESCRIPTION = "ID3 tags are found in MP3 files. They can store information about what band \
recorded the song, the song name, and more. ID3-V1 tags are seriously \
deficient as to the kind of and length of information that they can store. \
This is a tool for editing ID3-V2 tags in Linux."
LICENSE = "LGPL-2.1+"

PV = "0.1.12"

RPM_NAME = "id3v2-0.1.12-20.10.aarch64.rpm"
RPM_HASH = "484b26b54b08f8d8db25f1da1ebe77bf164c696a0835d4510e2f89c0dc475f44c3676b25ecd9cac144f9f1eea2741aa64c9960b8ac9a9066c0730303b673e1e4"

RPROVIDES:${PN} += "id3v2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libid3-3.8.so.3 \
libstdc++.so.6"

inherit rpm
