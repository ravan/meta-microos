SUMMARY = "Support for use of memoir in Serbian"
DESCRIPTION = "The package provides a number of commands for adjusting memoir \
output to Serbian style."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn45818"

RPM_NAME = "texlive-srbook-mem-2026.226.svn45818-64.2.noarch.rpm"
RPM_HASH = "5605d5ca4eff7e943b26b107330c98e5a83e572efa1df95e4fb54296000bbae21999a5454238bc69e7d9492cb9a65eb3d1dfcb8a7790e610e1235f39cef15c8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-srbook-mem.sty \
texlive-srbook-mem"

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
