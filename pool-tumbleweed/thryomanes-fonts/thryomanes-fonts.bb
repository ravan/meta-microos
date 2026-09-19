SUMMARY = "Greek TrueType Fonts"
DESCRIPTION = "These fonts include a complete set of Cyrillic letters and improved \
italic characters."
LICENSE = "GPL-2.0+"

PV = "1.2"

RPM_NAME = "thryomanes-fonts-1.2-179.25.noarch.rpm"
RPM_HASH = "f13319a2240f6d6b5e1238aa3c1462f49369979f3e2be337e91b874791c1554a9a775a893d66700bd57e6c0d266ad4e04bacb63093f6969cb37bd8c3ed1321f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fonts-thryomanes \
locale-bg;el;ru \
scalable-font-bg \
scalable-font-el \
scalable-font-ru \
thryomanes-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
