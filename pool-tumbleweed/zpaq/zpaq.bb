SUMMARY = "A journaling, incremental, deduplicating archiver"
DESCRIPTION = "zpaq is a journaling, incremental, deduplicating archiver. \
'Journaling' means that when you update a file or directory, both the \
old and new versions are saved and can be extracted. 'Incremental' \
means that only those files whose last-modified date has changed \
since the previous backup are added. For 100 GB of files, this \
typically takes 1-2 minutes, vs. a few hours to create the first \
version. 'Deduplicating' means that identical files or fragments are \
stored only once to save time and space."
LICENSE = "MIT & SUSE-Public-Domain"

PV = "7.15"

RPM_NAME = "zpaq-7.15-4.3.aarch64.rpm"
RPM_HASH = "27ee0daeb40a5518a2f5a4cc62bdd611a14b61013ba6b7d7fb724f62b9bb1b36f01f9b6fda3564c78b07f7992afbf2bf7ef32d936a833bf55a6bdd971dfb2516"

RPROVIDES:${PN} += "zpaq"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
