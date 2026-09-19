SUMMARY = "Modern Implementation of DBM - Shared Library"
DESCRIPTION = "Kyoto Cabinet is a library of routines for managing a database. The database \
is a simple data file containing records, each is a pair of a key and a \
value. Every key and value is serial bytes with variable length. Both binary \
data and character string can be used as a key and a value. Each key \
must be unique within a database. There is neither concept of data tables \
nor data types. Records are organized in hash table or B+ tree. \
 \
Kyoto Cabinet runs very fast. For example, elapsed time to store one \
million records is 0.9 seconds for hash database, and 1.1 seconds for B+ tree \
database. Moreover, the size of database is very small. For example, overhead \
for a record is 16 bytes for hash database, and 4 bytes for B+ tree database. \
Furthermore, scalability of Kyoto Cabinet is great. The database size can be \
up to 8EB (9.22e18 bytes). \
 \
Kyoto Cabinet is written in the C++ language, and provided as API of C++, C, \
Java, Python, Ruby, Perl, and Lua. Kyoto Cabinet is available on platforms \
which have API conforming to C++03 with the TR1 library extensions. \
Kyoto Cabinet is a free software licensed under the GNU General Public License. \
On the other hand, a commercial license is also provided. If you use \
Kyoto Cabinet within a proprietary software, the commercial license is required."
LICENSE = "SUSE-GPL-3.0-with-FLOSS-exception"

PV = "1.2.80"

RPM_NAME = "libkyotocabinet16-1.2.80-2.6.aarch64.rpm"
RPM_HASH = "767fa92ec222459b70753da8d7aec54a501fc15d17bb55d6028486ff2bb826d094b970841be9dba769bdc12019b91b242a0da9482f33f9de22a82e4712a63616"

RPROVIDES:${PN} += "libkyotocabinet \
libkyotocabinet.so.16 \
libkyotocabinet16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
