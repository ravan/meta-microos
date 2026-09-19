SUMMARY = "Unicode Collation Algorithm"
DESCRIPTION = "This module is an implementation of Unicode Technical Standard #10 (a.k.a. \
UTS #10) - Unicode Collation Algorithm (a.k.a. UCA)."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.31"

RPM_NAME = "perl-Unicode-Collate-1.31-1.29.aarch64.rpm"
RPM_HASH = "946598ee4a5236b023faba22c167a82fb6653a715f5b791e1998120e012a135295d1a22c4912771875c4fc7f8ebaacf3e7073b7fb9b3ca283dd179952a5bae20"

RPROVIDES:${PN} += "perl-Unicode--Collate \
perl-Unicode--Collate--CJK--Big5 \
perl-Unicode--Collate--CJK--GB2312 \
perl-Unicode--Collate--CJK--JISX0208 \
perl-Unicode--Collate--CJK--Korean \
perl-Unicode--Collate--CJK--Pinyin \
perl-Unicode--Collate--CJK--Stroke \
perl-Unicode--Collate--CJK--Zhuyin \
perl-Unicode--Collate--Locale \
perl-Unicode-Collate"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
