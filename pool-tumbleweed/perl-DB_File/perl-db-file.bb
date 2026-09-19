SUMMARY = "Perl access to Berkeley DB 1.x"
DESCRIPTION = "*DB_File* is a module which allows Perl programs to make use of the \
facilities provided by Berkeley DB version 1.x (if you have a newer version \
of DB, see Using DB_File with Berkeley DB version 2 or greater). It is \
assumed that you have a copy of the Berkeley DB manual pages at hand when \
reading this documentation. The interface defined here mirrors the Berkeley \
DB interface closely. \
 \
Berkeley DB is a C library which provides a consistent interface to a \
number of database formats. *DB_File* provides an interface to all three of \
the database types currently supported by Berkeley DB. \
 \
The file types are: \
 \
* *DB_HASH* \
 \
This database type allows arbitrary key/value pairs to be stored in data \
files. This is equivalent to the functionality provided by other hashing \
packages like DBM, NDBM, ODBM, GDBM, and SDBM. Remember though, the files \
created using DB_HASH are not compatible with any of the other packages \
mentioned. \
 \
A default hashing algorithm, which will be adequate for most applications, \
is built into Berkeley DB. If you do need to use your own hashing algorithm \
it is possible to write your own in Perl and have *DB_File* use it instead. \
 \
* *DB_BTREE* \
 \
The btree format allows arbitrary key/value pairs to be stored in a sorted, \
balanced binary tree. \
 \
As with the DB_HASH format, it is possible to provide a user defined Perl \
routine to perform the comparison of keys. By default, though, the keys are \
stored in lexical order. \
 \
* *DB_RECNO* \
 \
DB_RECNO allows both fixed-length and variable-length flat text files to be \
manipulated using the same key/value pair interface as in DB_HASH and \
DB_BTREE. In this case the key will consist of a record (line) number."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.860"

RPM_NAME = "perl-DB_File-1.860-1.5.aarch64.rpm"
RPM_HASH = "8be35f75267a1eb0715b91d0a31ad8deabbcd13595e8d3dde9f23f761389f84527dfa689e251f0a1b7f182e9bc5110f9f4c36f1f88c8bbdf9872922e007d1b2a"

RPROVIDES:${PN} += "perl-DB-File \
perl-DB-File--BTREEINFO \
perl-DB-File--HASHINFO \
perl-DB-File--RECNOINFO"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
perl--MODULE-COMPAT-5.44.0"

inherit rpm
