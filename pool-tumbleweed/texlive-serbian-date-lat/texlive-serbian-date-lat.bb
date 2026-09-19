SUMMARY = "Updated date typesetting for Serbian"
DESCRIPTION = "Babel defines dates for Serbian texts, in Latin script. The \
style it uses does not match current practices. The present \
package defines a \\date command that solves the problem."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn23446"

RPM_NAME = "texlive-serbian-date-lat-2026.226.svn23446-60.2.noarch.rpm"
RPM_HASH = "31ad0d2b7298769a487c42dec4527b1e9086858151bc083d4af9e3c137465a4dc14287f831894c38052e74edd746bf3e9233f75c3ddbd3c0cfd5ca7086be6b92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-serbian-date-lat.sty \
texlive-serbian-date-lat"

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
