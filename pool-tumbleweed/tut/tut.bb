SUMMARY = "A TUI for Mastodon with vim inspired keys"
DESCRIPTION = "tut is a TUI for Mastodon with vim inspired keys. TUI is an acronym for text-based user interface, so tut runs in your terminal."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "tut-2.0.1-1.19.aarch64.rpm"
RPM_HASH = "6d3302d8ca10324b77a128902a31e70f78966bec350d833fb4b7d283ac7f373099ffbc663e81137ed837c59a9edd842ceaa7f570cb9fbca259f851cb884bc836"

RPROVIDES:${PN} += "tut"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
