SUMMARY = "Database Sources for 'locale'"
DESCRIPTION = "This package contains the data needed to build the locale data files to \
use the internationalization features of the GNU libc. It is normally \
not necessary to install this packages, the data files are already \
created."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "2.44"

RPM_NAME = "glibc-i18ndata-2.44-2.1.noarch.rpm"
RPM_HASH = "39323f84b887aa2f4b6df855d59dc0bf50e73c2e409de197c10e8c17e8897dc39c35362cee560fafc829785695e0e63fd529cf25ce7db14fd6f8c2e87c793aeb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glibc-i18ndata"

RDEPENDS:${PN} += ""

inherit rpm
