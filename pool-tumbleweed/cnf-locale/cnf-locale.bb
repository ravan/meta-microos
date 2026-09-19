SUMMARY = "Locale support for cnf"
DESCRIPTION = "Locale support for cnf"
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "cnf-locale-0.9.1-1.1.noarch.rpm"
RPM_HASH = "f1d8dc986406126e1b91c3d3f22a7dea976e010c998545af4318c0a21ccecf78977cbb2d844cc452aa4fc8539b94b9fe0eb1db360148fbd5994ca420fa143379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cnf-locale \
cnf-rs-locale \
locale-cnf-af \
locale-cnf-ar \
locale-cnf-be \
locale-cnf-bg \
locale-cnf-bn \
locale-cnf-bs \
locale-cnf-ca \
locale-cnf-cs \
locale-cnf-da \
locale-cnf-de \
locale-cnf-el \
locale-cnf-en-GB \
locale-cnf-eo \
locale-cnf-es \
locale-cnf-et \
locale-cnf-fa \
locale-cnf-fi \
locale-cnf-fr \
locale-cnf-gl \
locale-cnf-gu \
locale-cnf-hi \
locale-cnf-hr \
locale-cnf-hu \
locale-cnf-id \
locale-cnf-it \
locale-cnf-ja \
locale-cnf-ka \
locale-cnf-km \
locale-cnf-ko \
locale-cnf-lt \
locale-cnf-mk \
locale-cnf-mr \
locale-cnf-nb \
locale-cnf-nl \
locale-cnf-nn \
locale-cnf-pa \
locale-cnf-pl \
locale-cnf-pt \
locale-cnf-pt-BR \
locale-cnf-ro \
locale-cnf-ru \
locale-cnf-sk \
locale-cnf-sl \
locale-cnf-sr \
locale-cnf-sv \
locale-cnf-ta \
locale-cnf-th \
locale-cnf-uk \
locale-cnf-wa \
locale-cnf-zh-CN \
locale-cnf-zh-TW"

RDEPENDS:${PN} += "cnf"

inherit rpm
