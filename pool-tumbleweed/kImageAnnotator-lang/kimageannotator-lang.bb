SUMMARY = "Translations for package kImageAnnotator"
DESCRIPTION = "Provides translations for the 'kImageAnnotator' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.2"

RPM_NAME = "kImageAnnotator-lang-0.7.2-1.3.noarch.rpm"
RPM_HASH = "23eda597a4707ef5cea49bf65b628b86fca26681fb3ce3f15f06bd752d7aee157f9dd20da1a82061eb22e4766d51719d01c7706e4385ff9a3b4ee88cf95db818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kImageAnnotator-lang"

RDEPENDS:${PN} += ""

inherit rpm
