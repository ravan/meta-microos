SUMMARY = "A reimplementation of extractbb, written in Lua"
DESCRIPTION = "extractbb is a program that exports the dimensions of an image \
or PDF file to a plain text format that is easily parsed by \
TeX. This tool is rarely run directly by users, but is \
frequently used by packages running on XeTeX or upTeX. This \
package specifically contains a Lua-based reimplementation \
extractbb that behaves identically to the original C-based \
version distributed with dvipdfmx."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn77855"

RPM_NAME = "texlive-extractbb-2026.226.1.1.0svn77855-59.2.noarch.rpm"
RPM_HASH = "97265d1fc28576f9068decafeec1959e9f785e7e439ddf2098d234a84c68d42c805994a39b9d091dce037d6b66ab75841aa8ea41be8665a960ef9225f029bce2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-extractbb"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-extractbb-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
