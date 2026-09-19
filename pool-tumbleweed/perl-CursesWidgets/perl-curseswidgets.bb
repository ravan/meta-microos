SUMMARY = "CursesWidgets Perl module"
DESCRIPTION = "NOTE:  This is **NOT** backwards compatible with the pre-1.99 versions. \
       This is entirely OO-based, hence any older scripts relying on the \
       old versions will need to be rewritten."
LICENSE = "GPL-2.0+"

PV = "1.997"

RPM_NAME = "perl-CursesWidgets-1.997-164.40.noarch.rpm"
RPM_HASH = "4f4c4ad2579e64849f66fce8c28c7c15adbea2bdeaf0f270a28102ae5e294a8dccc06f83a6cc345491411f9bb6768b68a4a7e5d1b61328ce66a0dc767fcc3be6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Curses--Widgets \
perl-Curses--Widgets--ButtonSet \
perl-Curses--Widgets--Calendar \
perl-Curses--Widgets--ComboBox \
perl-Curses--Widgets--Label \
perl-Curses--Widgets--ListBox \
perl-Curses--Widgets--ListBox--MultiColumn \
perl-Curses--Widgets--Menu \
perl-Curses--Widgets--ProgressBar \
perl-Curses--Widgets--TextField \
perl-Curses--Widgets--TextMemo \
perl-CursesWidgets"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
