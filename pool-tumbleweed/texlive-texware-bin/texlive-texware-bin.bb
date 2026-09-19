SUMMARY = "Binary files of texware"
DESCRIPTION = "Binary files of texware"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn77900"

RPM_NAME = "texlive-texware-bin-2026.20260301.svn77900-120.4.aarch64.rpm"
RPM_HASH = "80ab05ff0cad096352bff413479c7b00d13d780ce29a6a535be941a5ffac9cc6da9c179d1a887a6ff65b26307bc32c2293d7fd327550b92701aef52bf91285e7"

RPROVIDES:${PN} += "texlive-texware-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libkpathsea.so.6 \
texlive-texware"

inherit rpm
