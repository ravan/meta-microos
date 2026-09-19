SUMMARY = "Internal: Require all YaST Translation Packages (Empty)"
DESCRIPTION = "The package requires all YaST translation packages \
(yast2-trans-{??,??_??}).  Otherwise it is empty. \
 \
For internal use only."
LICENSE = "LGPL-2.1-or-later"

PV = "4.3.0"

RPM_NAME = "yast2-trans-allpacks-4.3.0-1.17.noarch.rpm"
RPM_HASH = "a30b4fce7b043cd4ff40726f432c159c8f0c0311bfe9886ec0c581ecbb0c80b86afac8f5f6dcc7b1c03efe8f655372bfe0193459d35a39d76ba03030b8ec4a32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yast2-trans-allpacks"

RDEPENDS:${PN} += "yast2-trans-af \
yast2-trans-ar \
yast2-trans-ast \
yast2-trans-bg \
yast2-trans-bn \
yast2-trans-bs \
yast2-trans-ca \
yast2-trans-cs \
yast2-trans-cy \
yast2-trans-da \
yast2-trans-de \
yast2-trans-el \
yast2-trans-en-GB \
yast2-trans-es \
yast2-trans-et \
yast2-trans-fa \
yast2-trans-fi \
yast2-trans-fr \
yast2-trans-gl \
yast2-trans-gu \
yast2-trans-hi \
yast2-trans-hr \
yast2-trans-hu \
yast2-trans-id \
yast2-trans-it \
yast2-trans-ja \
yast2-trans-jv \
yast2-trans-ka \
yast2-trans-km \
yast2-trans-kn \
yast2-trans-ko \
yast2-trans-ku \
yast2-trans-lo \
yast2-trans-lt \
yast2-trans-mk \
yast2-trans-mr \
yast2-trans-nb \
yast2-trans-nds \
yast2-trans-nl \
yast2-trans-nn \
yast2-trans-pa \
yast2-trans-pl \
yast2-trans-pt \
yast2-trans-pt-BR \
yast2-trans-ro \
yast2-trans-ru \
yast2-trans-si \
yast2-trans-sk \
yast2-trans-sl \
yast2-trans-sr \
yast2-trans-sv \
yast2-trans-sw \
yast2-trans-ta \
yast2-trans-tg \
yast2-trans-th \
yast2-trans-tr \
yast2-trans-uk \
yast2-trans-vi \
yast2-trans-wa \
yast2-trans-xh \
yast2-trans-zh-CN \
yast2-trans-zh-TW \
yast2-trans-zu"

inherit rpm
