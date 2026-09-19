SUMMARY = "Unicode line-breaking library"
DESCRIPTION = "liblinebreak is an implementation of the line breaking algorithm as \
described in Unicode 6.0.0 Standard Annex 14, Revision 26, available \
at http://www.unicode.org/reports/tr14/tr14-26.html"
LICENSE = "Zlib"

PV = "2.1"

RPM_NAME = "liblinebreak2-2.1-16.35.aarch64.rpm"
RPM_HASH = "db885385edbfac77e804c5c47d40774a919b73214bf6a55b84124d7e03816772d63aa0a59f65912f9bb5ac1b1cc5322733071b8d6f1e0b343dc7bf6d02b3393e"

RPROVIDES:${PN} += "liblinebreak \
liblinebreak.so.2 \
liblinebreak2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
