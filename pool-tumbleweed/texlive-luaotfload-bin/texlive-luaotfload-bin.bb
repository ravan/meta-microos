SUMMARY = "Binary files of luaotfload"
DESCRIPTION = "Binary files of luaotfload"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn34647"

RPM_NAME = "texlive-luaotfload-bin-2026.20260301.svn34647-120.4.aarch64.rpm"
RPM_HASH = "7f844b28efb04ee0f3226f152b6d49c7606e05c214fa0119e93aa76740c5b3b89d1819721529202aac6269726fc378cc901da7a49ee4ddf5330cadb4f1be8e8b"

RPROVIDES:${PN} += "texlive-luaotfload-bin"

RDEPENDS:${PN} += "texlive-luaotfload"

inherit rpm
