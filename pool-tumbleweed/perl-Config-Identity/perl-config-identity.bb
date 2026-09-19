SUMMARY = "Load (and optionally decrypt via GnuPG) user/pass identity information"
DESCRIPTION = "Config::Identity is a tool for loading (and optionally decrypting via \
GnuPG) user/pass identity information \
 \
For GitHub API access, an identity is a 'login'/'token' pair \
 \
For PAUSE access, an identity is a 'user'/'password' pair"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.0019"

RPM_NAME = "perl-Config-Identity-0.0019-1.26.noarch.rpm"
RPM_HASH = "30e57bb6cbac346ec29c46a8607d193ed36cfd7f125688b76cc73e30a98632856b88d89c621a5e10de877fd5a0a9b43cca14c518111de1e750ec853a6c8e4852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Config--Identity \
perl-Config--Identity--GitHub \
perl-Config--Identity--PAUSE \
perl-Config-Identity"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-File--HomeDir \
perl-File--Which \
perl-IPC--Run"

inherit rpm
