SUMMARY = "GTK+, Xfwm4 and Metacity Sonar Theme -- Common Files"
DESCRIPTION = "GTK+, Xfwm4 and Metacity theme created for openSUSE 11.2."
LICENSE = "GPL-2.0-or-later"

PV = "11.3.0"

RPM_NAME = "metatheme-sonar-common-11.3.0-31.9.noarch.rpm"
RPM_HASH = "e1a12b971ebd22e892fbff482a77bf24a178beccc0d304c63f8b52a9a55324b0187610a3e2b833584b8388e4ac0e864a19e7e79a29dd2d83f9af392f2dad44f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-sonar-common"

RDEPENDS:${PN} += ""

inherit rpm
