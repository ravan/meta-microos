SUMMARY = "Command Line Interface to WWW Search Engines"
DESCRIPTION = "Surfraw provides a Unix command line interface to a variety of \
WWW search engines and other artifacts of information and makes \
them available as extensions to the shell. \
Surfraw abstracts the browser away from input. Interpretation of \
linguistic forms is handed back to the shell."
LICENSE = "SUSE-Public-Domain"

PV = "2.3.0"

RPM_NAME = "surfraw-2.3.0-4.8.noarch.rpm"
RPM_HASH = "4a42e6e911d5dca445158e22feb01880411c399a7e0740bde93669215653f8cfd74f2db996122ca345e98077d94f958ae2bd61ed672eeba30bf268f14745bddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-surfraw \
surfraw"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
sed \
w3m \
xdg-utils"

inherit rpm
