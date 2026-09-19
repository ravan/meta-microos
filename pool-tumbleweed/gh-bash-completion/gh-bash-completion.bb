SUMMARY = "Bash Completion for gh"
DESCRIPTION = "Bash command line completion support for gh."
LICENSE = "MIT"

PV = "2.100.0"

RPM_NAME = "gh-bash-completion-2.100.0-1.1.noarch.rpm"
RPM_HASH = "8e542dd5a146ce70d2398e3725a416843cbdf1871e13313a0b1949bc5c495df2f60ae027430bf4497f680cda2d469e30834844eaf39117884fd82dfd35d45aa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gh-bash-completion"

RDEPENDS:${PN} += "bash-completion \
gh"

inherit rpm
