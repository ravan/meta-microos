SUMMARY = "Caslon TrueType Fonts"
DESCRIPTION = "The Caslon TrueType font is a partial implementation of Unicode. I does \
not contain \
 \
* CJK characters (ideographs) \
 \
* Asian & Indian alphabets and sylabaries \
 \
* Arabic \
 \
but it contains enough for most European languages including the \
euro-sign."
LICENSE = "BSD-3-Clause"

PV = "20031202"

RPM_NAME = "caslon-fonts-20031202-252.25.noarch.rpm"
RPM_HASH = "de63d7c0fe0007914a72858106d872de51dbac1d7b2db8925c8f261439c1c27bab2217c5b4654a0f610e2cb48fc8c29ae775405b946027661b9df22f9db2996a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "caslon-fonts \
scalable-font-bg \
scalable-font-el \
scalable-font-he \
scalable-font-ru"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
