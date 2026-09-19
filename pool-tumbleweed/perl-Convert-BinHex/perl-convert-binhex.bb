SUMMARY = "Extract Data From Macintosh Binhex Files"
DESCRIPTION = "*BinHex* is a format used by Macintosh for transporting Mac files safely \
through electronic mail, as short-lined, 7-bit, semi-compressed data \
streams. Ths module provides a means of converting those data streams back \
into into binary data."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.125"

RPM_NAME = "perl-Convert-BinHex-1.125-1.42.noarch.rpm"
RPM_HASH = "1f2903a99275f79d2d2e7ab69f70009aeba3ebf10249473b8805f1d0c31ce00612584aa4db8cdec211c8c7b08a894921e340519d39ca7fef41005a27197e90d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Convert--BinHex \
perl-Convert--BinHex--Bin2Hex \
perl-Convert--BinHex--Fork \
perl-Convert--BinHex--Hex2Bin \
perl-Convert--BinHex--IO-Handle \
perl-Convert--BinHex--IO-Scalar \
perl-Convert-BinHex"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
