SUMMARY = "JIS X 0212 (aka JIS 2000) Encodings"
DESCRIPTION = "This module implements encodings that covers JIS X 0213 charset (AKA \
JIS 2000, hence the module name)."
LICENSE = "Artistic-1.0"

PV = "0.03"

RPM_NAME = "perl-Encode-JIS2K-0.03-2.14.aarch64.rpm"
RPM_HASH = "5bf7ddc195c8aca921d945a7da1511625c5fccbc3f46c655e20c57fae43b66537ec77f571737dca833d92adafb0ef17fb59b95ab864896e276f38eacc5f70d39"

RPROVIDES:${PN} += "perl-Encode--JIS2K \
perl-Encode--JIS2K--2022JP3 \
perl-Encode-JIS2K"

RDEPENDS:${PN} += "/usr/bin/enc2xs \
/usr/bin/sh \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
