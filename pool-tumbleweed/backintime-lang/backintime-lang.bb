SUMMARY = "Translations for package backintime"
DESCRIPTION = "Provides translations for the 'backintime' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.1"

RPM_NAME = "backintime-lang-1.6.1-1.2.noarch.rpm"
RPM_HASH = "0546e761b8080a2763ee932834c1fb355d3bc517649b140470c5d26f1d87f144ce1d373fc00e006ac845d52f720f16a47f1d8b2cd1386b940fc3d98f2aba8f89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "backintime-lang \
backintime-lang-all \
locale-backintime-ar \
locale-backintime-bg \
locale-backintime-ca \
locale-backintime-cs \
locale-backintime-da \
locale-backintime-de \
locale-backintime-el \
locale-backintime-eo \
locale-backintime-es \
locale-backintime-et \
locale-backintime-eu \
locale-backintime-fa \
locale-backintime-fi \
locale-backintime-fr \
locale-backintime-gl \
locale-backintime-he \
locale-backintime-hr \
locale-backintime-hu \
locale-backintime-id \
locale-backintime-is \
locale-backintime-it \
locale-backintime-ja \
locale-backintime-ka \
locale-backintime-ko \
locale-backintime-lt \
locale-backintime-nb \
locale-backintime-nl \
locale-backintime-nn \
locale-backintime-pl \
locale-backintime-pt \
locale-backintime-pt-BR \
locale-backintime-ro \
locale-backintime-ru \
locale-backintime-sk \
locale-backintime-sl \
locale-backintime-sr \
locale-backintime-sv \
locale-backintime-tr \
locale-backintime-uk \
locale-backintime-vi \
locale-backintime-zh-CN \
locale-backintime-zh-TW"

RDEPENDS:${PN} += "backintime"

inherit rpm
