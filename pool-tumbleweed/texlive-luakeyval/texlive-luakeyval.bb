SUMMARY = "A minimal key/value system for LuaTeX based on token.scan_key_cs"
DESCRIPTION = "luakeyval is a Lua module that helps defining macros which \
accepts key/val lists by scanning the input stream with \
token.scan_key_cs. This is helpfull for creating use interface \
macros from within a Lua module."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn76992"

RPM_NAME = "texlive-luakeyval-2026.226.0.0.1svn76992-59.2.noarch.rpm"
RPM_HASH = "93c9190a70b9b18dcf3498715adb59056fe8e8bee9165634fcf557839fa8c967c16b565e49cbf98c83c881fc0359e0bb77bdcc1d7a920505061097e2267d64c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luakeyval"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
