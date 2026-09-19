SUMMARY = "Translations for package gpa"
DESCRIPTION = "Provides translations for the 'gpa' package."
LICENSE = "GPL-3.0-only"

PV = "0.11.1"

RPM_NAME = "gpa-lang-0.11.1-1.5.noarch.rpm"
RPM_HASH = "56acd6cfd75aa381513661f303dd6d42c80995a9f21f9cfe330dd90be1fc1c5059c4655e614031119af9bac7bee4665f4c8ad951159cd07be5d0e0abd88fd708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpa-lang \
gpa-lang-all \
locale-gpa-ar \
locale-gpa-cs \
locale-gpa-de \
locale-gpa-es \
locale-gpa-fr \
locale-gpa-ja \
locale-gpa-nl \
locale-gpa-pl \
locale-gpa-pt-BR \
locale-gpa-ru \
locale-gpa-sv \
locale-gpa-tr \
locale-gpa-zh-CN \
locale-gpa-zh-TW"

RDEPENDS:${PN} += "gpa"

inherit rpm
