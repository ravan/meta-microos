SUMMARY = "Mail handling library"
DESCRIPTION = "libEtPan is a mail purpose library. It will be used for low-level mail \
handling: network protocols (IMAP/NNTP/POP3/SMTP over TCP/IP and \
SSL/TCP/IP, already implemented), local storage (mbox/MH/maildir) \
and message / MIME parsing."
LICENSE = "BSD-3-Clause"

PV = "1.10.1"

RPM_NAME = "libetpan26-1.10.1-1.3.aarch64.rpm"
RPM_HASH = "6f52a22aa4ec827ae9354b5e307cf39c7d8217820998161580734c570b7df6b677d3b13667c463de13e5962a57ddccfdf23882271f60c0b51761ee0191b9fb13"

RPROVIDES:${PN} += "libetpan \
libetpan.so.26 \
libetpan26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
libgnutls.so.30 \
libsasl2.so.3 \
libz.so.1"

inherit rpm
