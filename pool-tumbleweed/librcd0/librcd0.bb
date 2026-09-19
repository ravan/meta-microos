SUMMARY = "Russian Charset Detection Library"
DESCRIPTION = "librcd is a library for automatic encoding detection of \
Russian/Ukrainian language texts. It is optimized for very small \
words and phrases."
LICENSE = "LGPL-2.1+"

PV = "0.1.14"

RPM_NAME = "librcd0-0.1.14-5.5.aarch64.rpm"
RPM_HASH = "c09388ddb4ac6390c9ce713ed476b93e1872711c05b65d1ad35790b0fc7270c08cb6f4cdb0b6cba68aa3adac95355ce4a16443c1491d163ac55b1b40b09374ba"

RPROVIDES:${PN} += "librcd.so.0 \
librcd0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
