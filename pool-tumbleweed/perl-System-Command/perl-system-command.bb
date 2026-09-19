SUMMARY = "Object for running system commands"
DESCRIPTION = "System::Command is a class that launches external system commands and \
return an object representing them, allowing to interact with them through \
their 'STDIN', 'STDOUT' and 'STDERR' handles."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.122"

RPM_NAME = "perl-System-Command-1.122-1.17.noarch.rpm"
RPM_HASH = "222c8abf7293b5f680aafbea3dbda6473504417635023d315aa860f6c15162aab5acda42b092b15d938af23f7035e8633d9fc62322fdada79906b55bca79ea26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-System--Command \
perl-System--Command--Reaper \
perl-System-Command"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-IPC--Run"

inherit rpm
