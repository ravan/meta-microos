SUMMARY = "Extensible Archive Format Tools"
DESCRIPTION = "The XAR project aims to provide an easily extensible archive format. Important \
design decisions include an easily extensible XML table of contents for random \
access to archived files, storing the toc at the beginning of the archive to \
allow for efficient handling of streamed archives, the ability to handle files \
of arbitrarily large sizes, the ability to choose independent encodings for \
individual files in the archive, the ability to store checksums for individual \
files in both compressed and uncompressed form, and the ability to query the \
table of content's rich meta-data."
LICENSE = "BSD-3-Clause"

PV = "1.8.0.0.503"

RPM_NAME = "xar-1.8.0.0.503-1.3.aarch64.rpm"
RPM_HASH = "aa098d11fc7083a99736bb6d9fadc64756e4c82afb2daa98cda6afa18926dd9d312f3265c801bba7647a57f715d25c96d4c4e844c7254e209a4f77e60ea10fed"

RPROVIDES:${PN} += "xar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxar.so.1"

inherit rpm
