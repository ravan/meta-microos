SUMMARY = "Perl extension for Berkeley DB version 2, 3, 4, 5 or 6"
DESCRIPTION = "*NOTE: This document is still under construction. Expect it to be \
incomplete in places.* \
 \
This Perl module provides an interface to most of the functionality \
available in Berkeley DB versions 2, 3, 5 and 6. In general it is safe to \
assume that the interface provided here to be identical to the Berkeley DB \
interface. The main changes have been to make the Berkeley DB API work in a \
Perl way. Note that if you are using Berkeley DB 2.x, the new features \
available in Berkeley DB 3.x or later are not available via this module. \
 \
The reader is expected to be familiar with the Berkeley DB documentation. \
Where the interface provided here is identical to the Berkeley DB library \
and the... TODO \
 \
The *db_appinit*, *db_cursor*, *db_open* and *db_txn* man pages are \
particularly relevant. \
 \
The interface to Berkeley DB is implemented with a number of Perl classes."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.670.0"

RPM_NAME = "perl-BerkeleyDB-0.670.0-1.6.aarch64.rpm"
RPM_HASH = "4ba71625103eee8792000e9bee7eb2e0f644f08abca5bcad5ac503a3a4b4c2cb6c51c5cb7ba5357e676259dff4027e0b4ede8f2f1de74b332983b9e50386fcaf"

RPROVIDES:${PN} += "perl-BerkeleyDB \
perl-BerkeleyDB--Btree \
perl-BerkeleyDB--CDS--Lock \
perl-BerkeleyDB--Common \
perl-BerkeleyDB--Cursor \
perl-BerkeleyDB--Env \
perl-BerkeleyDB--Hash \
perl-BerkeleyDB--Heap \
perl-BerkeleyDB--Queue \
perl-BerkeleyDB--Recno \
perl-BerkeleyDB--Term \
perl-BerkeleyDB--Txn \
perl-BerkeleyDB--TxnMgr \
perl-BerkeleyDB--Unknown"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
