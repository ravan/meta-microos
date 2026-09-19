SUMMARY = "Search in pdf files for strings matching a regular expression"
DESCRIPTION = "Pdfgrep is a tool to search text in PDF files. It works similar to `grep'. \
 \
Features: \
- search for regular expressions. \
- support for some important grep options, including: \
+ filename output. \
+ page number output. \
+ optional case insensitivity. \
+ count occurrences."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.0"

RPM_NAME = "pdfgrep-2.2.0-1.7.aarch64.rpm"
RPM_HASH = "ad5dca68bb64e5827c0f7600654d801cd8157cfbced89e876721f50ba4441db7ecac67266baeb50a8fa5048d30767fb363ac50b8eb5f74e12471a659109f9590"

RPROVIDES:${PN} += "pdfgrep"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libpcre2-8.so.0 \
libpoppler-cpp.so.3 \
libstdc++.so.6"

inherit rpm
