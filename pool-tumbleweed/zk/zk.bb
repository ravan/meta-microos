SUMMARY = "Plain text note-taking assistant for markdown"
DESCRIPTION = "Zk is a plain text note-taking assistant for markdown. \
It is a command-line tool helping you to maintain a plain text Zettelkasten or personal wiki."
LICENSE = "BSD-2-Clause"

PV = "0.15.6"

RPM_NAME = "zk-0.15.6-1.1.aarch64.rpm"
RPM_HASH = "e5b1cd50fb8d7ccaeabaa8e6603cb0218cab70f321e7673ad3eb412c0dfd2bc071f637b72e337087e95db9ce87e0b8102bb59a1dc1c8567e252d1d37ed14cf95"

RPROVIDES:${PN} += "zk"

RDEPENDS:${PN} += "fzf \
libc.so.6 \
libicui18n.so.78 \
libicuuc.so.78 \
libm.so.6"

inherit rpm
