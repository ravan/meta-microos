SUMMARY = "Helper services to setup git repositories for packaging"
LICENSE = "GPL-2.0-or-later"

PV = "0.3.1"

RPM_NAME = "pool-git-init-0.3.1-1.1.noarch.rpm"
RPM_HASH = "876bff9b457ef8b8d08a1b6175a7c5de38186d6c7861392ac30109c291f4cdd3366f25ece4d72761983dcee11d0fe3346166a0fd8d4d5822167c05de3b98788f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-git-init \
pool-git-init"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
perl-Config--INI \
perl-Config--IniFiles"

inherit rpm
