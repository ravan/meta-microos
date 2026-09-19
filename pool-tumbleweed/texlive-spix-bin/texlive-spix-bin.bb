SUMMARY = "Binary files of spix"
DESCRIPTION = "Binary files of spix"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn55933"

RPM_NAME = "texlive-spix-bin-2026.20260301.svn55933-120.4.aarch64.rpm"
RPM_HASH = "03f86349f4edd07f8d50653cb382ae302b140380c82b98ef209b4db08246efe01534e639c471ba93867f45f7c0045af1e83d9510751dffe432cc952a7fcb83ca"

RPROVIDES:${PN} += "texlive-spix-bin"

RDEPENDS:${PN} += "texlive-spix"

inherit rpm
