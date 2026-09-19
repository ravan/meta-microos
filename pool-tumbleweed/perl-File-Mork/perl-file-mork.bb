SUMMARY = "Module to read Mozilla URL history files"
DESCRIPTION = "This is a module that can read the Mozilla URL history file -- normally \
$HOME/.mozilla/default/*.slt/history.dat -- and extract the id, url, name, \
hostname, first visted dat, last visited date and visit count. \
 \
To find your history file it might be worth using *Mozilla::Backup* which \
has some platform-independent code for finding the profiles of various \
Mozilla-isms (including Firefox, Camino, K-Meleon, etc.)."
LICENSE = "MIT"

PV = "0.400.0"

RPM_NAME = "perl-File-Mork-0.400.0-1.9.noarch.rpm"
RPM_HASH = "b54d82060caff7956d31e75e5b09faf3cb1eca7cae736a8195155ef1e68c290bc02de6860ce70a973529af81fc9a59fd0825d6b691c4f428d41bc0847259095f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-File--Mork \
perl-File--Mork--Entry \
perl-File-Mork"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-HTML--Entities"

inherit rpm
