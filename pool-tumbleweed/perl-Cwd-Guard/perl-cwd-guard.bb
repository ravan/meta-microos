SUMMARY = "Temporary changing working directory (chdir)"
DESCRIPTION = "CORE::chdir Cwd:: Guard can change the current directory (chdir) using a \
limited scope."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.05"

RPM_NAME = "perl-Cwd-Guard-0.05-1.38.noarch.rpm"
RPM_HASH = "c360119191e0a5ed0760809bda691ab1c55d330106514e2757a31d669274c2da497d9268b8e2f5760ba822cec85153d6abb9eebcb4f8297ddd69116e64305f37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Cwd--Guard \
perl-Cwd-Guard"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-parent"

inherit rpm
