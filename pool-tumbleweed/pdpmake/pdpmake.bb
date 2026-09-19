SUMMARY = "Public domain POSIX make"
DESCRIPTION = "This version implements the make utility as defined in both the 2017 and 2024 POSIX standards. \
The default build from source includes a number of extensions but a key feature of the program \
is that it can be switched to a strictly POSIX-compliant mode at runtime"
LICENSE = "SUSE-Public-Domain"

PV = "2.0.4"

RPM_NAME = "pdpmake-2.0.4-2.4.aarch64.rpm"
RPM_HASH = "ab209b4affbca7be18479a60c5b5fb88702728f0c6678c0f8929f70a9dd04e5ad6409670e387b856811f799a56b6b20dc87992187afba6756ebb8b3d5bd29877"

RPROVIDES:${PN} += "pdpmake"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
