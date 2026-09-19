SUMMARY = "A maildir indexer and searcher"
DESCRIPTION = "mairix is a tool for indexing email messages stored in maildir format \
folders and performing fast searches on the resulting index.  The \
output is a new maildir folder containing symbolic links to the matched \
messages."
LICENSE = "GPL-2.0"

PV = "0.24"

RPM_NAME = "mairix-0.24-1.23.aarch64.rpm"
RPM_HASH = "ccac0294f23bb201208b1d80695a5430a5fdc511672e04f96935cb35960965379c3377da8fdc7802e163661cafdb67d44a0362fbff00a252b0ea19edbe16ed66"

RPROVIDES:${PN} += "mairix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
