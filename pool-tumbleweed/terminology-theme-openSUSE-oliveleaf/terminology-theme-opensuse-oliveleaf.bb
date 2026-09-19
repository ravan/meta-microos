SUMMARY = "Theme for Terminology"
DESCRIPTION = "A old openSUSE theme for Terminology"
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220219.1.26"

RPM_NAME = "terminology-theme-openSUSE-oliveleaf-20220219.1.26-2.2.noarch.rpm"
RPM_HASH = "b34268d09da6fb39e245ae4df75142333f353ad08dd3c60fac94eee22e54ae86d4dd12b904b5985ead106a33dbfc4cba7f8690b4c18afd3ba098b499f90528aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "terminology-theme \
terminology-theme-openSUSE-oliveleaf"

RDEPENDS:${PN} += "terminology"

inherit rpm
