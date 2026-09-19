SUMMARY = "Binary files of mkgrkindex"
DESCRIPTION = "Binary files of mkgrkindex"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn14428"

RPM_NAME = "texlive-mkgrkindex-bin-2026.20260301.svn14428-120.4.aarch64.rpm"
RPM_HASH = "87199259434d8170541bfd84f5bc97064731f6d74ed973e74a91eb5db7e6520bdc7972be5b53f33a0cd32d934776784f1bbf9cdb9d4a1033a5d7f72ffe1a68fe"

RPROVIDES:${PN} += "texlive-mkgrkindex-bin"

RDEPENDS:${PN} += "texlive-mkgrkindex"

inherit rpm
