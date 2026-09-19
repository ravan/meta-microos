SUMMARY = "Add-on packages for listings: autogobble and line background"
DESCRIPTION = "The bundle contains a small collection of add-on packages for \
the listings package. Current packages are: lstlinebgrd: colour \
the background of some or all lines of a listing; and \
lstautogobble: set the standard 'gobble' option to the indent \
of the first line of the code."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn72068"

RPM_NAME = "texlive-lstaddons-2026.226.0.0.2svn72068-59.2.noarch.rpm"
RPM_HASH = "fe2e155ce8a1b58f0c108ea68680df2a73a147a046c505a2688aa3d79aac5a9d2964100fc042873dbbcc25c369c0d01b8f2514905cfd8ef8bf0da9db67bb78a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lstautogobble.sty \
tex-lstlinebgrd.sty \
texlive-lstaddons"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
