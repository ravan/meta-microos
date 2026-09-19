SUMMARY = "Typesetting financial tables"
DESCRIPTION = "In financial reports, text and currency amounts are regularly \
put in one table, e.g., a year balance or a profit-and-loss \
overview. This package provides the settings for automatically \
typesetting such columns, including the sum line (preceded by a \
rule of the correct width) using the specifier 'f'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.4svn77682"

RPM_NAME = "texlive-fcolumn-2026.226.1.4.4svn77682-59.2.noarch.rpm"
RPM_HASH = "0cc4447e3e01fb7261d6767192e1e8fd13f4e5672dfd9847e611182f340abc478efd717271ac6063ecefa52562ae0e14e137fa04b4516e165364be936f36a507"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fcolumn.sty \
texlive-fcolumn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-color.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
