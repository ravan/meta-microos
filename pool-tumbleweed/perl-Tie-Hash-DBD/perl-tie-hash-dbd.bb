SUMMARY = "Tie plain hashes to DBI interface"
DESCRIPTION = "This module has been created to act as a drop-in replacement for modules \
that tie straight perl hashes to disk, like 'DB_File'. When the running \
system does not have enough memory to hold large hashes, and disk-tieing \
won't work because there is not enough space, it works quite well to tie \
the hash to a database, which preferable runs on a different server. \
 \
This module ties a hash to a database table using *only* a 'key' and a \
'value' field. If no tables specification is passed, this will create a \
temporary table with 'h_key' for the key field and a 'h_value' for the \
value field. \
 \
I think it would make sense to merge the functionality that this module \
provides into 'Tie::DBI'."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.260.0"

RPM_NAME = "perl-Tie-Hash-DBD-0.260.0-1.5.noarch.rpm"
RPM_HASH = "fa85fe91d85d714fcb5a161b36d2ba1a1107b6726adb535bbdd429153a138e2ff898dfa58c1d5870589b15069cd639d4c56cbdc16eebf5c0e380e9c48f96c65e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-Tie--Array--DBD \
perl-Tie--Hash--DBD \
perl-Tie-Hash-DBD"

RDEPENDS:${PN} += "perl--MODULE-COMPAT-5.44.0 \
perl-DBI \
perl-Test--More"

inherit rpm
