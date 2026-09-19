SUMMARY = "Convert byte count to human readable format"
DESCRIPTION = "THIS IS ALPHA SOFTWARE: THE DOCUMENTATION AND THE CODE WILL SUFFER CHANGES \
SOME DAY (THANKS, GOD!). \
 \
This module provides a formatter which turns byte counts to usual readable \
format, like '2.0K', '3.1G', '100B'. It was inspired in the '-h' option of \
Unix utilities like 'du', 'df' and 'ls' for 'human-readable' output."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.11"

RPM_NAME = "perl-Number-Bytes-Human-0.11-1.24.noarch.rpm"
RPM_HASH = "4dabbf33ef09a5a54a7a5fb96c3d692bff3590f708863ad38dccb08cbfdbac98db1a7961851fa072ed22e11146ceabf5afeff741e53abbba02e048e81c266b5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Number--Bytes--Human \
perl-Number-Bytes-Human"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0"

inherit rpm
