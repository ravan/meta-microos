SUMMARY = "Gender neutrality for languages with grammatical gender"
DESCRIPTION = "Many languages -- like German or French -- use masculine and \
feminine grammatical genders. There are many ideas how to \
promote gender neutrality in those languages. The gender \
package uses alternately masculine and feminine forms. It is \
also possible to use just one form out of a template."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn36464"

RPM_NAME = "texlive-gender-2026.226.1.0svn36464-60.2.noarch.rpm"
RPM_HASH = "7b1cc5a53001d4e4533e239253064961ee2fc39f67ec3707330c0e0cb2799aa11f2b28c9b44c693786e2cf9fe3b7c0b7a8680bab13a92520973615cc047770f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gender.sty \
texlive-gender"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
