SUMMARY = "Manualpages for Pluggable Authentication Modules"
DESCRIPTION = "PAM (Pluggable Authentication Modules) is a system security tool that \
allows system administrators to set authentication policies without \
having to recompile programs that do authentication. \
 \
This package contains the manual pages."
LICENSE = "GPL-2.0-or-later | BSD-3-Clause"

PV = "1.7.2+git48"

RPM_NAME = "pam-manpages-1.7.2+git48-1.1.noarch.rpm"
RPM_HASH = "2055f3f2cd5416d8a060741d1fd9f957fd6d915aa31d0bf47dadb792de5a4feacccd7aedc77e6c0134ee56cf26a19e3ec57009d9cb996c309c69801e12c4e574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pam-//usr/share/man/man8/PAM.8.gz \
pam-manpages"

RDEPENDS:${PN} += ""

inherit rpm
