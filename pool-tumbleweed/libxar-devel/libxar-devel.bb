SUMMARY = "Extensive Archive Format Library"
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

RPM_NAME = "libxar-devel-1.8.0.0.503-1.3.aarch64.rpm"
RPM_HASH = "43e61709b6c304c9b9a8036255c7f3732c6851db1c847a9c651efb59768e51a8ad392fdec0ccd477e85ceda0adb1b2007861d551eb577e0acd3849cc90b4e4fc"

RPROVIDES:${PN} += "libxar-devel"

RDEPENDS:${PN} += "libxar1"

inherit rpm
