SUMMARY = "Sender Rewriting Support for postfix"
DESCRIPTION = "PostSRSd provides the Sender Rewriting Scheme (SRS) via TCP-based \
lookup tables for Postfix. SRS is needed if your mail server acts \
as forwarder."
LICENSE = "GPL-2.0-only"

PV = "2.4.0"

RPM_NAME = "postsrsd-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "d750a8a7a5d10fce7329e0deb4b1f9a9d4f4b2298c734d1a75895c92cf61b7e330446cec99ae194ff59916f78f043d0b28b4afc7bc49bc16bb64a8b906ff2d2a"

RPROVIDES:${PN} += "group-postsrsd \
postsrsd \
user-postsrsd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libconfuse.so.2 \
libsqlite3.so.0"

inherit rpm
