SUMMARY = "Fish Completion for rage-encryption"
DESCRIPTION = "Fish command-line completion support for rage-encryption."
LICENSE = "(0BSD | MIT | Apache-2.0) & (Apache-2.0 | BSL-1.0) & (Apache-2.0 | MIT) & (Apache-2.0 | MIT | Zlib) & (MIT | Unlicense) & (Apache-2.0 | Zlib | MIT) & Apache-2.0 & BSD-3-Clause & CDDL-1.0 & MIT"

PV = "0.11.1+0"

RPM_NAME = "rage-encryption-fish-completion-0.11.1+0-3.9.noarch.rpm"
RPM_HASH = "6485d2356485ca3b98f8c4928cd0f17eb5059830b28bd4cb1834818b85a1e5f6bea6f01ff205dd394b471a23b6b6f4a1a4ef2a7b863c424e8a7c8e411703e9eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rage-encryption-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
