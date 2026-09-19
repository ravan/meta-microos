SUMMARY = "Asymptote by example"
DESCRIPTION = "This is a tutorial written in Simplified Chinese."
LICENSE = "LGPL-3.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-asymptote-by-example-zh-cn-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "9aba73597b1707a665f8dff24268f40494d901736ebabce0bebc0b33f1f344045db365b4331e520f6430821ed66a325522015cd3c59e7eb4d47fcf2b604020a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-asymptote-by-example-zh-cn"

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
