SUMMARY = "Construct dichotomous identification keys"
DESCRIPTION = "The package can be used to construct dichotomous identification \
keys (used especially in biology for species identification), \
taking care of numbering and indentation of successive key \
steps automatically. An example file is provided, which \
demonstrates usage."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn17192"

RPM_NAME = "texlive-dichokey-2026.226.svn17192-59.2.noarch.rpm"
RPM_HASH = "c61c8ce319fd213e57dccc95bec8a7865cdfc785855c84f65cd48765327ad61c38560ce392fe0148d059fa28f045c0d38b69acee3d343b91e4abc8b983b292ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dichokey.sty \
texlive-dichokey"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
